package k3.language.aspectgenerator;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Context {
  public List<String> packageCollection;
  
  public List<String> classCollection;
  
  public List<String> classAspectCollection;
  
  public Integer counterPackage;
  
  public StringBuffer kmtContent;
  
  public String projectName;
  
  public String projectPath;
  
  public String nameOperation;
  
  public Boolean isOverride;
  
  public List<String> operationParams;
  
  public List<String> listNewClass;
  
  public Context(final List<String> basePackage, final String projectPath, final String projectName, final String nameOperation, final List<String> listNewClass, final List<String> operationParams) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.packageCollection = _arrayList;
    int _size = basePackage.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      for (final String elt : basePackage) {
        this.packageCollection.add(elt);
      }
    }
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    this.classCollection = _arrayList_1;
    ArrayList<String> _arrayList_2 = new ArrayList<String>();
    this.classAspectCollection = _arrayList_2;
    this.counterPackage = Integer.valueOf(0);
    StringBuffer _stringBuffer = new StringBuffer();
    this.kmtContent = _stringBuffer;
    this.projectName = projectName;
    this.projectPath = (((projectPath + "/") + projectName) + "/src/");
    this.nameOperation = nameOperation;
    this.isOverride = Boolean.valueOf(false);
    this.operationParams = operationParams;
    this.listNewClass = listNewClass;
  }
  
  public String comment_ForMultiInheritence() {
    String result = "";
    result = (result + "\t/*");
    result = (result + "\n\t* BE CAREFUL :");
    result = (result + "\n\t*");
    result = (result + "\n\t* This class inherits of multi superclass");
    result = (result + "\n\t* please specify which parent you want with the \'super\' expected calling");
    result = (result + "\n\t*\n\t*/\n\n");
    return result;
  }
}
