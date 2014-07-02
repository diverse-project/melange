package k3.language.aspectgenerator

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension k3.language.aspectgenerator.EPackageAspect.*
import static extension k3.language.aspectgenerator.EClassAspect.*
import java.util.ArrayList
import java.util.List

class AspectGenerator{


	public def static void main(String[] args) {
		//println('Hello Kermeta on top of Xtend!')
		println(System.getProperty("user.dir") + "/target/");
		var String projectPath = System.getProperty("user.dir") + "/target/"
		var String projectName = "aspectKermeta"
		var String operationName = "eval"
		var List<String> listNewClass = new ArrayList<String>()
		var List<String> operationParams = new ArrayList<String>()
		listNewClass.add("Context")
		listNewClass.add("Essai")
		operationParams.add("Context context")
		operationParams.add("Essai test")
		
		aspectGenerate(new ArrayList<String>(), projectPath, projectName, operationName, "ASMLogo.ecore", listNewClass, operationParams)

	}
	
	public def static aspectGenerate(List<String> basePackage, String projectPath, String projectName, String operationName, String ecorePath, List<String> listNewClass, List<String> operationParams) {
		var Context context = new Context(basePackage, projectPath, projectName, operationName, listNewClass, operationParams)
		
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact)
		
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(ecorePath)
		var res = rs.getResource(uri, true)

		var EPackage p = res.contents.get(0) as EPackage
		p.generateAspect(context)
		generateClass(context)
	}
	
	private static def void generateClass(Context context) {
		// initialization of packaging for the class "Context"
		var List<String> packageCollection = new ArrayList<String>
		packageCollection.add(context.projectName)
		
		// initialization of the content of file "Context.xtend"
		var StringBuffer content = new StringBuffer
		
		
		for(c : context.listNewClass) {
			content.append("package " + context.projectName + "\n\n")
			content.append("class "+ c +" {\n\n")
			content.append("\tnew (){\n\n\t}")
			content.append("\n\n}\n")
			FileManager.writeFile(context.projectPath.substring(8), c, packageCollection, content.toString)
			content.delete(0, content.length)
		}
	}
}

@Aspect(className=typeof(EPackage)) 
class EPackageAspect { 
	
	public def void generateAspect(Context context) {		
		_self.addPackage(context)
		
		for (p : _self.ESubpackages){
			 p.generateAspect(context)
		}
		
		if (_self.EClassifiers.exists[elt | elt instanceof EClass]) {
					
			for(c : _self.EClassifiers){
				if(c instanceof EClass) {
					(c as EClass).generateAspect(context)
				}
			}
			_self.manageImport(context)
			FileManager.writeFile(context.projectPath.substring(8), context.packageCollection.last, context.packageCollection, context.kmtContent.toString)
			context.classCollection = new ArrayList<String>
			context.classAspectCollection = new ArrayList<String>
			context.kmtContent = new StringBuffer
			
		}
		
		_self.deletePackage(context)
	}
	
	def private void addPackage (Context context) {
		context.counterPackage = context.counterPackage + 1
		context.packageCollection.add(_self.name)		
	}
			
		
	def private void deletePackage (Context context) {
		context.packageCollection.remove(context.counterPackage - 1)
		if (context.counterPackage > 0) {
			context.counterPackage = context.counterPackage - 1
		}	
	}
	
	def private void manageImport(Context context) {
		var String pack = ""
		var StringBuffer aspect = new StringBuffer
		
		for(pc : context.packageCollection) {
			if(context.packageCollection.last() == pc){
				pack = pack + pc	
			} else {
				pack = pack + pc + "."
			}
		}
		
		aspect.append("package " + pack + "\n\n")			
		aspect.append("import fr.inria.diverse.k3.al.annotationprocessor.Aspect\n")
		
		if(context.isOverride) {
			aspect.append("import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod\n")			
		}
		
		for (c : context.listNewClass)
		{
			aspect.append("import " + context.projectName + "." + c + "\n")
		}
		
		for (cl : context.classCollection){
			aspect.append("import " + pack + "." + cl + "\n")
		}
		
		aspect.append("\n")
		
		for (cl : context.classAspectCollection){
			aspect.append("import static extension " + pack + "." + cl + ".*\n")
		}
		
		aspect.append("\n")
		context.kmtContent.insert(0, aspect.toString)
		context.kmtContent.append("\n\n")
	}
}

@Aspect(className=typeof(EClass)) 
class EClassAspect {
	
		def public void generateAspect(Context context) {
			
			_self.writeOpenClass(context)
			if(context.nameOperation != null) {
				_self.writeOperation(context)
			}
			_self.writeCloseClass(context)
			
		}
		
		def private void writeOpenClass (Context context) {
			var String scriptNewClass = ""
			
			_self.addClass (context)
			
			scriptNewClass = scriptNewClass + "@Aspect(className=" + _self.name + ")\n"
						
			if (_self.abstract) {
				scriptNewClass = scriptNewClass + "abstract class "
			} else {
				scriptNewClass = scriptNewClass + "class "
			}
			scriptNewClass = scriptNewClass + _self.name + "Aspect" 
			if (!_self.ESuperTypes.empty) {
				scriptNewClass = scriptNewClass + " extends " + _self.ESuperTypes.get(0).name + "Aspect"
			}
			scriptNewClass = scriptNewClass + " {\n"
			if(_self.ESuperTypes.length > 1){
				scriptNewClass = scriptNewClass + context.comment_ForMultiInheritence
			}
			
			context.kmtContent.append(scriptNewClass)
		}
		
	def private void writeCloseClass (Context context) {
		context.kmtContent.append("\n}\n\n")
	}
		
	def private void addClass (Context context) {
		context.classCollection.add(_self.name)
		context.classAspectCollection.add(_self.name + "Aspect")
	}
	
	def private void writeOperation (Context context) {
		var StringBuffer operation = new StringBuffer
		
		operation.append("\tdef public void " + context.nameOperation + " (")
		
		for(op : context.operationParams) {
			operation.append(op)
			if(op != context.operationParams.last) {
				operation.append(", ")
			}
		}
		operation.append(")")
		
		if (!_self.ESuperTypes.empty) {
			context.kmtContent.append("\t@OverrideAspectMethod\n")
			context.kmtContent.append(operation)
			context.isOverride = true
		} else {
			context.kmtContent.append(operation)
		}
		context.kmtContent.append(" { \n\n\t}")
			
	}
	
}


