package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.AndAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAssignmentAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanExpressionAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanOperationAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVarAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVariableRefAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.DivideAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.EqualAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterOrEqualAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IfAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntAssignmentAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntComparisonAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntExpressionAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntOperationAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntVariableRefAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerVarAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessOrEqualAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MinusAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MultiplyAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.NotAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.OrAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PlusAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintStrAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintVarAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.StatementAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableRefAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.WhileAdapter;
import fr.inria.diverse.melanger.miniactionlang.minilang.And;
import fr.inria.diverse.melanger.miniactionlang.minilang.Block;
import fr.inria.diverse.melanger.miniactionlang.minilang.BooleanAssignment;
import fr.inria.diverse.melanger.miniactionlang.minilang.BooleanExpression;
import fr.inria.diverse.melanger.miniactionlang.minilang.BooleanOperation;
import fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVar;
import fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVariableRef;
import fr.inria.diverse.melanger.miniactionlang.minilang.Context;
import fr.inria.diverse.melanger.miniactionlang.minilang.Divide;
import fr.inria.diverse.melanger.miniactionlang.minilang.Equal;
import fr.inria.diverse.melanger.miniactionlang.minilang.Greater;
import fr.inria.diverse.melanger.miniactionlang.minilang.GreaterOrEqual;
import fr.inria.diverse.melanger.miniactionlang.minilang.If;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntAssignment;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntComparison;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntExpression;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntOperation;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntVariableRef;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntegerVar;
import fr.inria.diverse.melanger.miniactionlang.minilang.Less;
import fr.inria.diverse.melanger.miniactionlang.minilang.LessOrEqual;
import fr.inria.diverse.melanger.miniactionlang.minilang.Minus;
import fr.inria.diverse.melanger.miniactionlang.minilang.Multiply;
import fr.inria.diverse.melanger.miniactionlang.minilang.Not;
import fr.inria.diverse.melanger.miniactionlang.minilang.Or;
import fr.inria.diverse.melanger.miniactionlang.minilang.Plus;
import fr.inria.diverse.melanger.miniactionlang.minilang.PrintStr;
import fr.inria.diverse.melanger.miniactionlang.minilang.PrintVar;
import fr.inria.diverse.melanger.miniactionlang.minilang.Statement;
import fr.inria.diverse.melanger.miniactionlang.minilang.Variable;
import fr.inria.diverse.melanger.miniactionlang.minilang.VariableRef;
import fr.inria.diverse.melanger.miniactionlang.minilang.While;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MiniActionLangMTAdaptersFactory implements AdaptersFactory {
  private static MiniActionLangMTAdaptersFactory instance;
  
  public static MiniActionLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MiniActionLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Integer){
    	return createIntegerAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Integer) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.IntOperation){
    	return createIntOperationAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.IntOperation) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.IntExpression){
    	return createIntExpressionAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.IntExpression) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Boolean){
    	return createBooleanAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Boolean) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Equal){
    	return createEqualAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Equal) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Greater){
    	return createGreaterAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Greater) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.GreaterOrEqual){
    	return createGreaterOrEqualAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.GreaterOrEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Less){
    	return createLessAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Less) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.LessOrEqual){
    	return createLessOrEqualAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.LessOrEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Not){
    	return createNotAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Not) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Or){
    	return createOrAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Or) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.And){
    	return createAndAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.And) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Plus){
    	return createPlusAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Plus) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Minus){
    	return createMinusAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Minus) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Multiply){
    	return createMultiplyAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Multiply) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Divide){
    	return createDivideAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Divide) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.BooleanOperation){
    	return createBooleanOperationAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.BooleanOperation) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.BooleanExpression){
    	return createBooleanExpressionAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.BooleanExpression) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.IntVariableRef){
    	return createIntVariableRefAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.IntVariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.VariableRef){
    	return createVariableRefAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.VariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.BooleanAssignment){
    	return createBooleanAssignmentAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.BooleanAssignment) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.IntAssignment){
    	return createIntAssignmentAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.IntAssignment) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.PrintVar){
    	return createPrintVarAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.PrintVar) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.PrintStr){
    	return createPrintStrAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.PrintStr) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Statement){
    	return createStatementAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Statement) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Block){
    	return createBlockAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Block) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.If){
    	return createIfAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.If) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.While){
    	return createWhileAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.While) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Context){
    	return createContextAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Context) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.IntegerVar){
    	return createIntegerVarAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.IntegerVar) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVar){
    	return createBooleanVarAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.BooleanVar) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.miniactionlang.minilang.Variable){
    	return createVariableAdapter((fr.inria.diverse.melanger.miniactionlang.minilang.Variable) o, res);
    }
    
    return null;
  }
  
  public IntExpressionAdapter createIntExpressionAdapter(final IntExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntExpressionAdapter) adapter;
    }
  }
  
  public IntegerAdapter createIntegerAdapter(final fr.inria.diverse.melanger.miniactionlang.minilang.Integer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerAdapter) adapter;
    }
  }
  
  public BooleanAdapter createBooleanAdapter(final fr.inria.diverse.melanger.miniactionlang.minilang.Boolean adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAdapter) adapter;
    }
  }
  
  public IntOperationAdapter createIntOperationAdapter(final IntOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntOperationAdapter) adapter;
    }
  }
  
  public EqualAdapter createEqualAdapter(final Equal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.EqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.EqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.EqualAdapter) adapter;
    }
  }
  
  public GreaterAdapter createGreaterAdapter(final Greater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterAdapter) adapter;
    }
  }
  
  public GreaterOrEqualAdapter createGreaterOrEqualAdapter(final GreaterOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterOrEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.GreaterOrEqualAdapter) adapter;
    }
  }
  
  public LessAdapter createLessAdapter(final Less adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessAdapter) adapter;
    }
  }
  
  public LessOrEqualAdapter createLessOrEqualAdapter(final LessOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessOrEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.LessOrEqualAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.NotAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.NotAdapter) adapter;
    }
  }
  
  public OrAdapter createOrAdapter(final Or adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.OrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.OrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.OrAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.AndAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.AndAdapter) adapter;
    }
  }
  
  public PlusAdapter createPlusAdapter(final Plus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PlusAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PlusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PlusAdapter) adapter;
    }
  }
  
  public MinusAdapter createMinusAdapter(final Minus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MinusAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MinusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MinusAdapter) adapter;
    }
  }
  
  public MultiplyAdapter createMultiplyAdapter(final Multiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MultiplyAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.MultiplyAdapter) adapter;
    }
  }
  
  public DivideAdapter createDivideAdapter(final Divide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.DivideAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.DivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.DivideAdapter) adapter;
    }
  }
  
  public IntComparisonAdapter createIntComparisonAdapter(final IntComparison adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntComparisonAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntComparisonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntComparisonAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanExpressionAdapter) adapter;
    }
  }
  
  public BooleanOperationAdapter createBooleanOperationAdapter(final BooleanOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanOperationAdapter) adapter;
    }
  }
  
  public BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVariableRefAdapter) adapter;
    }
  }
  
  public IntVariableRefAdapter createIntVariableRefAdapter(final IntVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntVariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntVariableRefAdapter) adapter;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableRefAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.StatementAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.StatementAdapter) adapter;
    }
  }
  
  public BooleanAssignmentAdapter createBooleanAssignmentAdapter(final BooleanAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAssignmentAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanAssignmentAdapter) adapter;
    }
  }
  
  public IntAssignmentAdapter createIntAssignmentAdapter(final IntAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntAssignmentAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntAssignmentAdapter) adapter;
    }
  }
  
  public PrintVarAdapter createPrintVarAdapter(final PrintVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintVarAdapter) adapter;
    }
  }
  
  public PrintStrAdapter createPrintStrAdapter(final PrintStr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintStrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintStrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.PrintStrAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter) adapter;
    }
  }
  
  public IfAdapter createIfAdapter(final If adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IfAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IfAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IfAdapter) adapter;
    }
  }
  
  public WhileAdapter createWhileAdapter(final While adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.WhileAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.WhileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.WhileAdapter) adapter;
    }
  }
  
  public ContextAdapter createContextAdapter(final Context adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableAdapter) adapter;
    }
  }
  
  public IntegerVarAdapter createIntegerVarAdapter(final IntegerVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntegerVarAdapter) adapter;
    }
  }
  
  public BooleanVarAdapter createBooleanVarAdapter(final BooleanVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanVarAdapter) adapter;
    }
  }
}
