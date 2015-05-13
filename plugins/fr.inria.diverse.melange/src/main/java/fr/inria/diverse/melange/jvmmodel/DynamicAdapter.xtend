package fr.inria.diverse.melange.jvmmodel

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import java.lang.reflect.Proxy
import org.eclipse.emf.ecore.EClass

/**
 * This class adapt a Metaclass from a language to be viewed as a Metaclass from a Modeltype
 */
class DynamicAdapter implements InvocationHandler{
	
	/**
	 * 
	 */
	private Object adaptee
	
	/**
	 * The language where the adaptee comes from
	 */
	private Metamodel language
	
	/**
	 * The interface typing the adaptee
	 */
	private ModelType modeltype
	
	
	
	private new(Object adaptee, Metamodel mm, ModelType modeltype){
		this.adaptee = adaptee
		this.language = mm
		this.modeltype = modeltype
	}
	
	/**
	 * Entry point to create an adapter
	 */
	public static def Object newInstance(Object adaptee, Metamodel mm, ModelType modeltype){
		return Proxy.newProxyInstance(
			adaptee.getClass().getClassLoader(),
			getMatchingType(modeltype, adaptee).class.interfaces,
			new DynamicAdapter(adaptee,mm,modeltype)
		)
	}
	
	/**
	 * Will invoke on {@link proxy} the method defined in the right Language
	 */
	override invoke(Object proxy, Method method, Object[] args) throws Throwable {
		var Object res = null
		
		val aspectMethod = getAspectMethod(method)
		if(aspectMethod !== null){
			args.add(0,proxy) // First arg of Aspect methods is the caller
			res = aspectMethod.invoke(null,args) //Aspect methods are static
		}
		else{
			method.invoke(proxy,args)
		}
		
		//Always return GenericAdapter or null to be used in Melange's Transformations
		if(res instanceof DynamicAdapter || res === null){
			return res
		}		
		else{
			return newInstance(res,language,modeltype)
		}
	}
	
	/**
	 * Search for a method with a matching signature in Aspects of the attribute {@link language}.
	 * Return null if not found.
	 */
	private def Method getAspectMethod(Method method){
		//TODO
		return null
	}
	
	/**
	 * Search for a class in {@link mt} with a matching name for the {@link obj}'s class name
	 */
	private static def EClass getMatchingType(ModelType mt, Object obj){
		//TODO
		return null
	}
}