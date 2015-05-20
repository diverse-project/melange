package org.autorefactor.ui;

import java.util.ArrayList;

public class PropertiesSetVO {

	private String mergedPropertiesFile;
	private ArrayList<String> allPropertiesFiles;
	
	public PropertiesSetVO(){
		allPropertiesFiles = new ArrayList<String>();
	}
	
	public String getMergedPropertiesFile() {
		return mergedPropertiesFile;
	}
	public void setMergedPropertiesFile(String mergedPropertiesFile) {
		this.mergedPropertiesFile = mergedPropertiesFile;
	}
	public ArrayList<String> getAllPropertiesFiles() {
		return allPropertiesFiles;
	}
	public void setAllPropertiesFiles(ArrayList<String> allPropertiesFiles) {
		this.allPropertiesFiles = allPropertiesFiles;
	}
	
	public String toString(){
		String toString = this.mergedPropertiesFile + " {";
		for(String _file : allPropertiesFiles){
			toString += _file + ", ";
		}
		toString += "}";
		return toString;
	}
}
