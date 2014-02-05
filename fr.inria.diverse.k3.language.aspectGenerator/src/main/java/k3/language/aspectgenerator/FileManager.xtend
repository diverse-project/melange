package k3.language.aspectgenerator

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.File
import java.util.List

static class FileManager {
	
	def public static void writeFile(String pathProject, String nameFile, List<String> collectionPackage, String content) {
		
		println("projectPath = " + pathProject);
		println("nameFile = " + nameFile);
		println("content = " + content);
		
		
		var String pathCurrent = writePackage(pathProject, collectionPackage)
		
		var BufferedWriter buffer = new BufferedWriter(new FileWriter(pathCurrent + nameFile + ".xtend"))
		
		buffer.write(content)
		buffer.flush
		buffer.close
	}
	
	def static private String writePackage(String pathProject, List<String> collectionPackage) {
		
		var String currentPath = pathProject + "/"
		
		for(pack : collectionPackage) {
			currentPath = currentPath + "/" + pack
			var File dir =  new File(currentPath);
			dir.mkdirs
		}
		currentPath = currentPath + "/"
		
		return currentPath
	}
	
}