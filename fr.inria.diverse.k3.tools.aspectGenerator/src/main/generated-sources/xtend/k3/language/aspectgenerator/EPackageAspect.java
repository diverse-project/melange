package k3.language.aspectgenerator;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import java.util.ArrayList;
import k3.language.aspectgenerator.Context;
import k3.language.aspectgenerator.EClassAspect;
import k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties;
import k3.language.aspectgenerator.FileManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = EPackage.class)
@SuppressWarnings("all")
public class EPackageAspect {
  public static void generateAspect(final EPackage _self, final Context context) {
    k3.language.aspectgenerator.EPackageAspectEPackageAspectContext _instance = k3.language.aspectgenerator.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties prop = new k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privgenerateAspect(_self,context); 
  }
  
  private static void addPackage(final EPackage _self, final Context context) {
    k3.language.aspectgenerator.EPackageAspectEPackageAspectContext _instance = k3.language.aspectgenerator.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties prop = new k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privaddPackage(_self,context); 
  }
  
  private static void deletePackage(final EPackage _self, final Context context) {
    k3.language.aspectgenerator.EPackageAspectEPackageAspectContext _instance = k3.language.aspectgenerator.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties prop = new k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privdeletePackage(_self,context); 
  }
  
  private static void manageImport(final EPackage _self, final Context context) {
    k3.language.aspectgenerator.EPackageAspectEPackageAspectContext _instance = k3.language.aspectgenerator.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties prop = new k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privmanageImport(_self,context); 
  }
  
  public static EPackageAspectEPackageAspectProperties _self_;
  
  protected static void privgenerateAspect(final EPackage _self, final Context context) {
    EPackageAspect.addPackage(_self, context);
    EList<EPackage> _eSubpackages = _self.getESubpackages();
    for (final EPackage p : _eSubpackages) {
      EPackageAspect.generateAspect(p, context);
    }
    EList<EClassifier> _eClassifiers = _self.getEClassifiers();
    final Function1<EClassifier,Boolean> _function = new Function1<EClassifier,Boolean>() {
      public Boolean apply(final EClassifier elt) {
        return Boolean.valueOf((elt instanceof EClass));
      }
    };
    boolean _exists = IterableExtensions.<EClassifier>exists(_eClassifiers, _function);
    if (_exists) {
      EList<EClassifier> _eClassifiers_1 = _self.getEClassifiers();
      for (final EClassifier c : _eClassifiers_1) {
        if ((c instanceof EClass)) {
          EClassAspect.generateAspect(((EClass) c), context);
        }
      }
      EPackageAspect.manageImport(_self, context);
      String _substring = context.projectPath.substring(8);
      String _last = IterableExtensions.<String>last(context.packageCollection);
      String _string = context.kmtContent.toString();
      FileManager.writeFile(_substring, _last, context.packageCollection, _string);
      ArrayList<String> _arrayList = new ArrayList<String>();
      context.classCollection = _arrayList;
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      context.classAspectCollection = _arrayList_1;
      StringBuffer _stringBuffer = new StringBuffer();
      context.kmtContent = _stringBuffer;
    }
    EPackageAspect.deletePackage(_self, context);
  }
  
  protected static void privaddPackage(final EPackage _self, final Context context) {
    context.counterPackage = Integer.valueOf(((context.counterPackage).intValue() + 1));
    String _name = _self.getName();
    context.packageCollection.add(_name);
  }
  
  protected static void privdeletePackage(final EPackage _self, final Context context) {
    context.packageCollection.remove(((context.counterPackage).intValue() - 1));
    if (((context.counterPackage).intValue() > 0)) {
      context.counterPackage = Integer.valueOf(((context.counterPackage).intValue() - 1));
    }
  }
  
  protected static void privmanageImport(final EPackage _self, final Context context) {
    String pack = "";
    StringBuffer aspect = new StringBuffer();
    for (final String pc : context.packageCollection) {
      String _last = IterableExtensions.<String>last(context.packageCollection);
      boolean _equals = Objects.equal(_last, pc);
      if (_equals) {
        pack = (pack + pc);
      } else {
        pack = ((pack + pc) + ".");
      }
    }
    aspect.append((("package " + pack) + "\n\n"));
    aspect.append("import fr.inria.triskell.k3.Aspect\n");
    if ((context.isOverride).booleanValue()) {
      aspect.append("import fr.inria.triskell.k3.OverrideAspectMethod\n");
    }
    for (final String c : context.listNewClass) {
      aspect.append((((("import " + context.projectName) + ".") + c) + "\n"));
    }
    for (final String cl : context.classCollection) {
      aspect.append((((("import " + pack) + ".") + cl) + "\n"));
    }
    aspect.append("\n");
    for (final String cl_1 : context.classAspectCollection) {
      aspect.append((((("import static extension " + pack) + ".") + cl_1) + ".*\n"));
    }
    aspect.append("\n");
    String _string = aspect.toString();
    context.kmtContent.insert(0, _string);
    context.kmtContent.append("\n\n");
  }
}
