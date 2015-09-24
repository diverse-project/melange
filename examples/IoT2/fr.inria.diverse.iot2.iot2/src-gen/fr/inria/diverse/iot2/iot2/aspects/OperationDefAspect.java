package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Containment;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;

@Aspect(className = OperationDef.class)
@SuppressWarnings("all")
public class OperationDefAspect {
  public static void execute(final OperationDef _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,c);
  }
  
  @Containment
  public static Block lua(final OperationDef _self) {
    fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_lua(_self_, _self);
    return (fr.inria.diverse.iot2.iot2.iot2.Block)result;
  }
  
  @Containment
  public static void lua(final OperationDef _self, final Block lua) {
    fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectContext.getSelf(_self);
    _privk3_lua(_self_, _self,lua);
  }
  
  protected static void _privk3_execute(final OperationDefAspectOperationDefAspectProperties _self_, final OperationDef _self, final Environment c) {
    Block _lua = OperationDefAspect.lua(_self);
    BlockAspect.execute(_lua, c);
  }
  
  protected static Block _privk3_lua(final OperationDefAspectOperationDefAspectProperties _self_, final OperationDef _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLua") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.inria.diverse.iot2.iot2.iot2.Block) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    
    return _self_.lua;
  }
  
  protected static void _privk3_lua(final OperationDefAspectOperationDefAspectProperties _self_, final OperationDef _self, final Block lua) {
    _self_.lua = lua; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Lua")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, lua);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
