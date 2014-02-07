package k3.language.aspectgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k3.language.aspectgenerator.Context;
import k3.language.aspectgenerator.EPackageAspect;
import k3.language.aspectgenerator.FileManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class AspectGenerator {
  public static void main(final String[] args) {
    String _property = System.getProperty("user.dir");
    String _plus = (_property + "/target/");
    InputOutput.<String>println(_plus);
    String _property_1 = System.getProperty("user.dir");
    String projectPath = (_property_1 + "/target/");
    String projectName = "aspectKermeta";
    String operationName = "eval";
    List<String> listNewClass = new ArrayList<String>();
    List<String> operationParams = new ArrayList<String>();
    listNewClass.add("Context");
    listNewClass.add("Essai");
    operationParams.add("Context context");
    operationParams.add("Essai test");
    ArrayList<String> _arrayList = new ArrayList<String>();
    AspectGenerator.aspectGenerate(_arrayList, projectPath, projectName, operationName, "ASMLogo.ecore", listNewClass, operationParams);
  }
  
  public static void aspectGenerate(final List<String> basePackage, final String projectPath, final String projectName, final String operationName, final String ecorePath, final List<String> listNewClass, final List<String> operationParams) {
    Context context = new Context(basePackage, projectPath, projectName, operationName, listNewClass, operationParams);
    EcoreResourceFactoryImpl fact = new EcoreResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    }
    Map<String,Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("*", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createURI(ecorePath);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    EPackage p = ((EPackage) _get);
    EPackageAspect.generateAspect(p, context);
    AspectGenerator.generateClass(context);
  }
  
  private static void generateClass(final Context context) {
    List<String> packageCollection = new ArrayList<String>();
    packageCollection.add(context.projectName);
    StringBuffer content = new StringBuffer();
    for (final String c : context.listNewClass) {
      {
        content.append((("package " + context.projectName) + "\n\n"));
        content.append((("class " + c) + " {\n\n"));
        content.append("\tnew (){\n\n\t}");
        content.append("\n\n}\n");
        String _substring = context.projectPath.substring(8);
        String _string = content.toString();
        FileManager.writeFile(_substring, c, packageCollection, _string);
        int _length = content.length();
        content.delete(0, _length);
      }
    }
  }
}
