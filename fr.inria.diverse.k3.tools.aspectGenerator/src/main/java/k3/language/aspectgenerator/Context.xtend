package k3.language.aspectgenerator

import java.util.List
import java.util.ArrayList

class Context {
	
	//public List<String> 	basePackage
	public List<String> 	packageCollection
	public List<String>		classCollection
	public List<String>		classAspectCollection
	public Integer 			counterPackage
	public StringBuffer		kmtContent
	public String			projectName
	public String			projectPath
	public String			nameOperation
	public Boolean			isOverride
	public List<String>		operationParams
	public List<String>		listNewClass
	
	new(List<String> basePackage, String projectPath, String projectName, String nameOperation,List<String> listNewClass, List<String> operationParams) {
		packageCollection = new ArrayList<String>
		if(basePackage.size > 0) {
			for (elt : basePackage) {
				packageCollection.add(elt);
			}
		}
		classCollection = new ArrayList<String>
		classAspectCollection = new ArrayList<String>
		counterPackage = 0
		kmtContent = new StringBuffer
		this.projectName = projectName
		this.projectPath = projectPath +"/" + projectName + "/src/"
		this.nameOperation = nameOperation
		isOverride = false
		this.operationParams = operationParams
		this.listNewClass = listNewClass
		
	}
	
	def public String comment_ForMultiInheritence() {
		var String result = ""
		result = result + "\t/*"
		result = result + "\n\t* BE CAREFUL :"
		result = result + "\n\t*"
		result = result + "\n\t* This class has more than one superclass"
		result = result + "\n\t* please specify which parent you want with the 'super' expected calling"
		result = result + "\n\t*\n\t*/\n\n"
		
		return result
	}
}