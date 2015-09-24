package fr.inria.diverse.iot2.iot2.aspects;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import fr.inria.diverse.iot2.iot2.iot2.Function;

@SuppressWarnings("all")
public class Environment {
  private Environment parent;
  
  private Stack<Object> values = new Stack<Object>();
  
  private Map<String, Object> variables = new HashMap<String, Object>();
  
  private Map<String, Function> functions = new HashMap<String, Function>();
  
  public Environment getParent() {
    return this.parent;
  }
  
  public void setParent(final Environment e) {
    this.parent = e;
  }
  
  public Object getVariable(final String s) {
    return this.variables.get(s);
  }
  
  public void pushValue(final Object o) {
    this.values.push(o);
  }
  
  public Object popValue() {
    return this.values.pop();
  }
  
  public void putFunction(final String s, final Function f) {
    this.functions.put(s, f);
  }
  
  public Function getFunction(final String s) {
    return this.functions.get(s);
  }
  
  public void putVariable(final String s, final Object o) {
    this.variables.put(s, o);
  }
  
  public void putAllVariables(final Map<String, Object> v) {
    this.variables.putAll(v);
  }
  
  public void putAllFunctions(final Map<String, Function> f) {
    this.functions.putAll(f);
  }
  
  public void pushAllValues(final Stack<Object> v) {
    this.values.addAll(v);
  }
  
  public Stack<Object> getValues() {
    return this.values;
  }
  
  public Map<String, Object> getVariables() {
    return this.variables;
  }
  
  public Map<String, Function> getFunctions() {
    return this.functions;
  }
}
