package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.AndAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BlockAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAssignmentAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanOperationAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVarAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVariableRefAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.DivideAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.EqualAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FSMAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FinalStateAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterOrEqualAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntAssignmentAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntComparisonAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntOperationAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntVariableRefAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerVarAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessOrEqualAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MinusAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MultiplyAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.NotAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.OrAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PlusAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintStrAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintVarAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StatementAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.TransitionAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableRefAdapter;
import fr.inria.diverse.melanger.melangedlang.minifsm.And;
import fr.inria.diverse.melanger.melangedlang.minifsm.Block;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanAssignment;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanOperation;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVar;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVariableRef;
import fr.inria.diverse.melanger.melangedlang.minifsm.Context;
import fr.inria.diverse.melanger.melangedlang.minifsm.Divide;
import fr.inria.diverse.melanger.melangedlang.minifsm.Equal;
import fr.inria.diverse.melanger.melangedlang.minifsm.FSM;
import fr.inria.diverse.melanger.melangedlang.minifsm.FinalState;
import fr.inria.diverse.melanger.melangedlang.minifsm.Greater;
import fr.inria.diverse.melanger.melangedlang.minifsm.GreaterOrEqual;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntAssignment;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntComparison;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntOperation;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntVariableRef;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntegerVar;
import fr.inria.diverse.melanger.melangedlang.minifsm.Less;
import fr.inria.diverse.melanger.melangedlang.minifsm.LessOrEqual;
import fr.inria.diverse.melanger.melangedlang.minifsm.Minus;
import fr.inria.diverse.melanger.melangedlang.minifsm.Multiply;
import fr.inria.diverse.melanger.melangedlang.minifsm.Not;
import fr.inria.diverse.melanger.melangedlang.minifsm.Or;
import fr.inria.diverse.melanger.melangedlang.minifsm.Plus;
import fr.inria.diverse.melanger.melangedlang.minifsm.PrintStr;
import fr.inria.diverse.melanger.melangedlang.minifsm.PrintVar;
import fr.inria.diverse.melanger.melangedlang.minifsm.State;
import fr.inria.diverse.melanger.melangedlang.minifsm.Statement;
import fr.inria.diverse.melanger.melangedlang.minifsm.Transition;
import fr.inria.diverse.melanger.melangedlang.minifsm.Variable;
import fr.inria.diverse.melanger.melangedlang.minifsm.VariableRef;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MelangedLangMTAdaptersFactory implements AdaptersFactory {
  private static MelangedLangMTAdaptersFactory instance;
  
  public static MelangedLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MelangedLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.FSM){
    	return createFSMAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.FSM) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.FinalState){
    	return createFinalStateAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.FinalState) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.State){
    	return createStateAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.State) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Transition){
    	return createTransitionAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Transition) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Integer){
    	return createIntegerAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Integer) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.IntExpression){
    	return createIntExpressionAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.IntExpression) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Context){
    	return createContextAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Context) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Variable){
    	return createVariableAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Variable) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Boolean){
    	return createBooleanAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Boolean) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Equal){
    	return createEqualAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Equal) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Greater){
    	return createGreaterAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Greater) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.GreaterOrEqual){
    	return createGreaterOrEqualAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.GreaterOrEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Less){
    	return createLessAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Less) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.LessOrEqual){
    	return createLessOrEqualAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.LessOrEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Not){
    	return createNotAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Not) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Or){
    	return createOrAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Or) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.And){
    	return createAndAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.And) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.BooleanOperation){
    	return createBooleanOperationAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.BooleanOperation) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.BooleanExpression){
    	return createBooleanExpressionAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.BooleanExpression) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Plus){
    	return createPlusAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Plus) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Minus){
    	return createMinusAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Minus) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Multiply){
    	return createMultiplyAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Multiply) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Divide){
    	return createDivideAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Divide) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.IntOperation){
    	return createIntOperationAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.IntOperation) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVariableRef){
    	return createBooleanVariableRefAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.IntVariableRef){
    	return createIntVariableRefAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.IntVariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.VariableRef){
    	return createVariableRefAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.VariableRef) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.BooleanAssignment){
    	return createBooleanAssignmentAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.BooleanAssignment) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.IntAssignment){
    	return createIntAssignmentAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.IntAssignment) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.PrintVar){
    	return createPrintVarAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.PrintVar) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.PrintStr){
    	return createPrintStrAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.PrintStr) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Statement){
    	return createStatementAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Statement) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.Block){
    	return createBlockAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.Block) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.IntegerVar){
    	return createIntegerVarAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.IntegerVar) o, res);
    }
    if (o instanceof fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVar){
    	return createBooleanVarAdapter((fr.inria.diverse.melanger.melangedlang.minifsm.BooleanVar) o, res);
    }
    
    return null;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FSMAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) adapter;
    }
  }
  
  public FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FinalStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FinalStateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.TransitionAdapter) adapter;
    }
  }
  
  public IntegerAdapter createIntegerAdapter(final fr.inria.diverse.melanger.melangedlang.minifsm.Integer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerAdapter) adapter;
    }
  }
  
  public IntExpressionAdapter createIntExpressionAdapter(final IntExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter) adapter;
    }
  }
  
  public ContextAdapter createContextAdapter(final Context adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableAdapter) adapter;
    }
  }
  
  public BooleanAdapter createBooleanAdapter(final fr.inria.diverse.melanger.melangedlang.minifsm.Boolean adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAdapter) adapter;
    }
  }
  
  public BooleanExpressionAdapter createBooleanExpressionAdapter(final BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter) adapter;
    }
  }
  
  public EqualAdapter createEqualAdapter(final Equal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.EqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.EqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.EqualAdapter) adapter;
    }
  }
  
  public IntComparisonAdapter createIntComparisonAdapter(final IntComparison adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntComparisonAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntComparisonAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntComparisonAdapter) adapter;
    }
  }
  
  public GreaterAdapter createGreaterAdapter(final Greater adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterAdapter) adapter;
    }
  }
  
  public GreaterOrEqualAdapter createGreaterOrEqualAdapter(final GreaterOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterOrEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.GreaterOrEqualAdapter) adapter;
    }
  }
  
  public LessAdapter createLessAdapter(final Less adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessAdapter) adapter;
    }
  }
  
  public LessOrEqualAdapter createLessOrEqualAdapter(final LessOrEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessOrEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessOrEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.LessOrEqualAdapter) adapter;
    }
  }
  
  public NotAdapter createNotAdapter(final Not adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.NotAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.NotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.NotAdapter) adapter;
    }
  }
  
  public OrAdapter createOrAdapter(final Or adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.OrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.OrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.OrAdapter) adapter;
    }
  }
  
  public BooleanOperationAdapter createBooleanOperationAdapter(final BooleanOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanOperationAdapter) adapter;
    }
  }
  
  public AndAdapter createAndAdapter(final And adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.AndAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.AndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.AndAdapter) adapter;
    }
  }
  
  public PlusAdapter createPlusAdapter(final Plus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PlusAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PlusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PlusAdapter) adapter;
    }
  }
  
  public IntOperationAdapter createIntOperationAdapter(final IntOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntOperationAdapter) adapter;
    }
  }
  
  public MinusAdapter createMinusAdapter(final Minus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MinusAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MinusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MinusAdapter) adapter;
    }
  }
  
  public MultiplyAdapter createMultiplyAdapter(final Multiply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MultiplyAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MultiplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.MultiplyAdapter) adapter;
    }
  }
  
  public DivideAdapter createDivideAdapter(final Divide adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.DivideAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.DivideAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.DivideAdapter) adapter;
    }
  }
  
  public BooleanVariableRefAdapter createBooleanVariableRefAdapter(final BooleanVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVariableRefAdapter) adapter;
    }
  }
  
  public VariableRefAdapter createVariableRefAdapter(final VariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableRefAdapter) adapter;
    }
  }
  
  public IntVariableRefAdapter createIntVariableRefAdapter(final IntVariableRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntVariableRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntVariableRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntVariableRefAdapter) adapter;
    }
  }
  
  public BooleanAssignmentAdapter createBooleanAssignmentAdapter(final BooleanAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAssignmentAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanAssignmentAdapter) adapter;
    }
  }
  
  public StatementAdapter createStatementAdapter(final Statement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StatementAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StatementAdapter) adapter;
    }
  }
  
  public IntAssignmentAdapter createIntAssignmentAdapter(final IntAssignment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntAssignmentAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntAssignmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntAssignmentAdapter) adapter;
    }
  }
  
  public PrintVarAdapter createPrintVarAdapter(final PrintVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintVarAdapter) adapter;
    }
  }
  
  public PrintStrAdapter createPrintStrAdapter(final PrintStr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintStrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintStrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.PrintStrAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BlockAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BlockAdapter) adapter;
    }
  }
  
  public IntegerVarAdapter createIntegerVarAdapter(final IntegerVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntegerVarAdapter) adapter;
    }
  }
  
  public BooleanVarAdapter createBooleanVarAdapter(final BooleanVar adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVarAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVarAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVarAdapter) adapter;
    }
  }
}
