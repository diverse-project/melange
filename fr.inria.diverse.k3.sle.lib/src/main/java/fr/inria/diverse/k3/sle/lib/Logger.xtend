package fr.inria.diverse.k3.sle.lib

import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

class Logger
{
	static String DEBUG_FILE = "/tmp/k3sle.debug"

	static def log(String s) {
		try {
			val writer = new PrintWriter(new BufferedWriter(new FileWriter(DEBUG_FILE, true)))
			writer.write("[" + new java.util.Date() + "] " + s + "\n")
		} catch (IOException e) {
			e.printStackTrace
		}
	}
}
