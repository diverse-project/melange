package k3.language.aspectgenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FileManager {
  public static void writeFile(final String pathProject, final String nameFile, final List<String> collectionPackage, final String content) {
    try {
      InputOutput.<String>println(("projectPath = " + pathProject));
      InputOutput.<String>println(("nameFile = " + nameFile));
      InputOutput.<String>println(("content = " + content));
      String pathCurrent = FileManager.writePackage(pathProject, collectionPackage);
      FileWriter _fileWriter = new FileWriter(((pathCurrent + nameFile) + ".xtend"));
      BufferedWriter buffer = new BufferedWriter(_fileWriter);
      buffer.write(content);
      buffer.flush();
      buffer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static String writePackage(final String pathProject, final List<String> collectionPackage) {
    String currentPath = (pathProject + "/");
    for (final String pack : collectionPackage) {
      {
        currentPath = ((currentPath + "/") + pack);
        File dir = new File(currentPath);
        dir.mkdirs();
      }
    }
    currentPath = (currentPath + "/");
    return currentPath;
  }
}
