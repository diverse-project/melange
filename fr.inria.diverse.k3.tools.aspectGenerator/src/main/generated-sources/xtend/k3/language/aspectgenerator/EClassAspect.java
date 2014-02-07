package k3.language.aspectgenerator;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import k3.language.aspectgenerator.Context;
import k3.language.aspectgenerator.EClassAspectEClassAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = EClass.class)
@SuppressWarnings("all")
public class EClassAspect {
  public static void generateAspect(final EClass _self, final Context context) {
    k3.language.aspectgenerator.EClassAspectEClassAspectContext _instance = k3.language.aspectgenerator.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,k3.language.aspectgenerator.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EClassAspectEClassAspectProperties prop = new k3.language.aspectgenerator.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privgenerateAspect(_self,context); 
  }
  
  private static void writeOpenClass(final EClass _self, final Context context) {
    k3.language.aspectgenerator.EClassAspectEClassAspectContext _instance = k3.language.aspectgenerator.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,k3.language.aspectgenerator.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EClassAspectEClassAspectProperties prop = new k3.language.aspectgenerator.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privwriteOpenClass(_self,context); 
  }
  
  private static void writeCloseClass(final EClass _self, final Context context) {
    k3.language.aspectgenerator.EClassAspectEClassAspectContext _instance = k3.language.aspectgenerator.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,k3.language.aspectgenerator.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EClassAspectEClassAspectProperties prop = new k3.language.aspectgenerator.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privwriteCloseClass(_self,context); 
  }
  
  private static void addClass(final EClass _self, final Context context) {
    k3.language.aspectgenerator.EClassAspectEClassAspectContext _instance = k3.language.aspectgenerator.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,k3.language.aspectgenerator.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EClassAspectEClassAspectProperties prop = new k3.language.aspectgenerator.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privaddClass(_self,context); 
  }
  
  private static void writeOperation(final EClass _self, final Context context) {
    k3.language.aspectgenerator.EClassAspectEClassAspectContext _instance = k3.language.aspectgenerator.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,k3.language.aspectgenerator.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3.language.aspectgenerator.EClassAspectEClassAspectProperties prop = new k3.language.aspectgenerator.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privwriteOperation(_self,context); 
  }
  
  public static EClassAspectEClassAspectProperties _self_;
  
  protected static void privgenerateAspect(final EClass _self, final Context context) {
    EClassAspect.writeOpenClass(_self, context);
    boolean _notEquals = (!Objects.equal(context.nameOperation, null));
    if (_notEquals) {
      EClassAspect.writeOperation(_self, context);
    }
    EClassAspect.writeCloseClass(_self, context);
  }
  
  protected static void privwriteOpenClass(final EClass _self, final Context context) {
    String scriptNewClass = "";
    EClassAspect.addClass(_self, context);
    String _name = _self.getName();
    String _plus = ((scriptNewClass + "@Aspect(className=typeof(") + _name);
    String _plus_1 = (_plus + "))\n");
    scriptNewClass = _plus_1;
    boolean _isAbstract = _self.isAbstract();
    if (_isAbstract) {
      scriptNewClass = (scriptNewClass + "abstract class ");
    } else {
      scriptNewClass = (scriptNewClass + "class ");
    }
    String _name_1 = _self.getName();
    String _plus_2 = (scriptNewClass + _name_1);
    String _plus_3 = (_plus_2 + "Aspect");
    scriptNewClass = _plus_3;
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    boolean _isEmpty = _eSuperTypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EClass> _eSuperTypes_1 = _self.getESuperTypes();
      EClass _get = _eSuperTypes_1.get(0);
      String _name_2 = _get.getName();
      String _plus_4 = ((scriptNewClass + " extends ") + _name_2);
      String _plus_5 = (_plus_4 + "Aspect");
      scriptNewClass = _plus_5;
    }
    scriptNewClass = (scriptNewClass + " {\n");
    EList<EClass> _eSuperTypes_2 = _self.getESuperTypes();
    int _length = ((Object[])Conversions.unwrapArray(_eSuperTypes_2, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      String _comment_ForMultiInheritence = context.comment_ForMultiInheritence();
      String _plus_6 = (scriptNewClass + _comment_ForMultiInheritence);
      scriptNewClass = _plus_6;
    }
    context.kmtContent.append(scriptNewClass);
  }
  
  protected static void privwriteCloseClass(final EClass _self, final Context context) {
    context.kmtContent.append("\n}\n\n");
  }
  
  protected static void privaddClass(final EClass _self, final Context context) {
    String _name = _self.getName();
    context.classCollection.add(_name);
    String _name_1 = _self.getName();
    String _plus = (_name_1 + "Aspect");
    context.classAspectCollection.add(_plus);
  }
  
  protected static void privwriteOperation(final EClass _self, final Context context) {
    StringBuffer operation = new StringBuffer();
    operation.append((("\tdef public void " + context.nameOperation) + " ("));
    for (final String op : context.operationParams) {
      {
        operation.append(op);
        String _last = IterableExtensions.<String>last(context.operationParams);
        boolean _notEquals = (!Objects.equal(op, _last));
        if (_notEquals) {
          operation.append(", ");
        }
      }
    }
    operation.append(")");
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    boolean _isEmpty = _eSuperTypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      context.kmtContent.append("\t@OverrideAspectMethod\n");
      context.kmtContent.append(operation);
      context.isOverride = Boolean.valueOf(true);
    } else {
      context.kmtContent.append(operation);
    }
    context.kmtContent.append(" { \n\n\t}");
  }
}
