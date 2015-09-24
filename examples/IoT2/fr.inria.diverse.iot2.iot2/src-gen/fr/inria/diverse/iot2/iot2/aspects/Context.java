package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import fr.inria.diverse.iot2.iot2.aspects.Trace;

@SuppressWarnings("all")
public class Context {
  public Trace output;
  
  public Activity activity;
  
  public Context parent;
  
  public List<InputValue> inputValues = CollectionLiterals.<InputValue>newArrayList();
  
  public JoinNode node;
  
  public Context() {
  }
  
  public Context(final Trace c, final Activity a, final List<InputValue> inputValues, final Context parent) {
    this.output = c;
    this.activity = a;
    this.inputValues = inputValues;
    this.parent = parent;
  }
}
