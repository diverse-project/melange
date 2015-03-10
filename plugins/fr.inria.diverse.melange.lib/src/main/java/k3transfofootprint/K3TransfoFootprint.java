package k3transfofootprint;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import k3transfofootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;
import org.eclipse.xtext.common.types.JvmCompoundTypeReference;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmDelegateTypeReference;
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class K3TransfoFootprint {
  public final Set<String> footprint = CollectionLiterals.<String>newHashSet();
  
  private boolean addQN(final String qn) {
    boolean _xifexpression = false;
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _and_3 = false;
    boolean _and_4 = false;
    boolean _and_5 = false;
    boolean _and_6 = false;
    boolean _notEquals = (!Objects.equal(qn, null));
    if (!_notEquals) {
      _and_6 = false;
    } else {
      boolean _startsWith = qn.startsWith("java.");
      boolean _not = (!_startsWith);
      _and_6 = _not;
    }
    if (!_and_6) {
      _and_5 = false;
    } else {
      boolean _startsWith_1 = qn.startsWith("com.google.");
      boolean _not_1 = (!_startsWith_1);
      _and_5 = _not_1;
    }
    if (!_and_5) {
      _and_4 = false;
    } else {
      boolean _startsWith_2 = qn.startsWith("sun.");
      boolean _not_2 = (!_startsWith_2);
      _and_4 = _not_2;
    }
    if (!_and_4) {
      _and_3 = false;
    } else {
      boolean _startsWith_3 = qn.startsWith("javax.");
      boolean _not_3 = (!_startsWith_3);
      _and_3 = _not_3;
    }
    if (!_and_3) {
      _and_2 = false;
    } else {
      boolean _startsWith_4 = qn.startsWith("com.sun");
      boolean _not_4 = (!_startsWith_4);
      _and_2 = _not_4;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      boolean _startsWith_5 = qn.startsWith("com.oracle");
      boolean _not_5 = (!_startsWith_5);
      _and_1 = _not_5;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _startsWith_6 = qn.startsWith("sunw.");
      boolean _not_6 = (!_startsWith_6);
      _and = _not_6;
    }
    if (_and) {
      _xifexpression = this.footprint.add(qn);
    }
    return _xifexpression;
  }
  
  private final List<JvmFormalParameter> inputJvmFormalParameter;
  
  private final List<JvmTypeReference> inputJvmTypeReference;
  
  private final List<XExpression> inputXExpression;
  
  public K3TransfoFootprint(final List<JvmFormalParameter> inputJvmFormalParameter, final List<JvmTypeReference> inputJvmTypeReference, final List<XExpression> inputXExpression) {
    this.inputJvmFormalParameter = inputJvmFormalParameter;
    this.inputJvmTypeReference = inputJvmTypeReference;
    this.inputXExpression = inputXExpression;
  }
  
  public void slice() {
    this.onStart();
    if (this.inputJvmFormalParameter!=null) {
      final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
        public void accept(final JvmFormalParameter it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      this.inputJvmFormalParameter.forEach(_function);
    }
    if (this.inputJvmTypeReference!=null) {
      final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
        public void accept(final JvmTypeReference it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      this.inputJvmTypeReference.forEach(_function_1);
    }
    if (this.inputXExpression!=null) {
      final Consumer<XExpression> _function_2 = new Consumer<XExpression>() {
        public void accept(final XExpression it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      this.inputXExpression.forEach(_function_2);
    }
    if (this.inputJvmFormalParameter!=null) {
      final Consumer<JvmFormalParameter> _function_3 = new Consumer<JvmFormalParameter>() {
        public void accept(final JvmFormalParameter it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      this.inputJvmFormalParameter.forEach(_function_3);
    }
    if (this.inputJvmTypeReference!=null) {
      final Consumer<JvmTypeReference> _function_4 = new Consumer<JvmTypeReference>() {
        public void accept(final JvmTypeReference it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      this.inputJvmTypeReference.forEach(_function_4);
    }
    if (this.inputXExpression!=null) {
      final Consumer<XExpression> _function_5 = new Consumer<XExpression>() {
        public void accept(final XExpression it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      this.inputXExpression.forEach(_function_5);
    }
    this.onEnd();
  }
  
  public void onJvmTypeReferenceSliced(final JvmTypeReference type) {
    InputOutput.<JvmTypeReference>println(type);
  }
  
  public void onJvmIdentifiableElementSliced(final JvmIdentifiableElement ident) {
    InputOutput.<JvmIdentifiableElement>println(ident);
  }
  
  public void onifSliced(final XIfExpression theSrc, final XExpression theTgt) {
  }
  
  public void onthenSliced(final XIfExpression theSrc, final XExpression theTgt) {
  }
  
  public void onelseSliced(final XIfExpression theSrc, final XExpression theTgt) {
  }
  
  public void onswitchSliced(final XSwitchExpression theSrc, final XExpression theTgt) {
  }
  
  public void oncasesSliced(final XSwitchExpression theSrc, final XCasePart theTgt) {
  }
  
  public void ondefaultSliced(final XSwitchExpression theSrc, final XExpression theTgt) {
  }
  
  public void ondeclaredParamSliced(final XSwitchExpression theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void oncaseSliced(final XCasePart theSrc, final XExpression theTgt) {
  }
  
  public void onthenSliced(final XCasePart theSrc, final XExpression theTgt) {
  }
  
  public void ontypeGuardSliced(final XCasePart theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onexpressionsSliced(final XBlockExpression theSrc, final XExpression theTgt) {
  }
  
  public void ontypeSliced(final XVariableDeclaration theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onrightSliced(final XVariableDeclaration theSrc, final XExpression theTgt) {
  }
  
  public void onfeatureSliced(final XAbstractFeatureCall theSrc, final JvmIdentifiableElement theTgt) {
  }
  
  public void ontypeArgumentsSliced(final XAbstractFeatureCall theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onimplicitReceiverSliced(final XAbstractFeatureCall theSrc, final XExpression theTgt) {
  }
  
  public void onimplicitFirstArgumentSliced(final XAbstractFeatureCall theSrc, final XExpression theTgt) {
  }
  
  public void onmemberCallTargetSliced(final XMemberFeatureCall theSrc, final XExpression theTgt) {
  }
  
  public void onmemberCallArgumentsSliced(final XMemberFeatureCall theSrc, final XExpression theTgt) {
  }
  
  public void onfeatureCallArgumentsSliced(final XFeatureCall theSrc, final XExpression theTgt) {
  }
  
  public void onconstructorSliced(final XConstructorCall theSrc, final JvmConstructor theTgt) {
  }
  
  public void onargumentsSliced(final XConstructorCall theSrc, final XExpression theTgt) {
  }
  
  public void ontypeArgumentsSliced(final XConstructorCall theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onelementsSliced(final XCollectionLiteral theSrc, final XExpression theTgt) {
  }
  
  public void ondeclaredFormalParametersSliced(final XClosure theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void onexpressionSliced(final XClosure theSrc, final XExpression theTgt) {
  }
  
  public void onimplicitFormalParametersSliced(final XClosure theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void ontypeSliced(final XCastedExpression theSrc, final JvmTypeReference theTgt) {
  }
  
  public void ontargetSliced(final XCastedExpression theSrc, final XExpression theTgt) {
  }
  
  public void onleftOperandSliced(final XBinaryOperation theSrc, final XExpression theTgt) {
  }
  
  public void onrightOperandSliced(final XBinaryOperation theSrc, final XExpression theTgt) {
  }
  
  public void onoperandSliced(final XUnaryOperation theSrc, final XExpression theTgt) {
  }
  
  public void onoperandSliced(final XPostfixOperation theSrc, final XExpression theTgt) {
  }
  
  public void onforExpressionSliced(final XForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void oneachExpressionSliced(final XForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void ondeclaredParamSliced(final XForLoopExpression theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void oneachExpressionSliced(final XBasicForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void onexpressionSliced(final XBasicForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void oninitExpressionsSliced(final XBasicForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void onupdateExpressionsSliced(final XBasicForLoopExpression theSrc, final XExpression theTgt) {
  }
  
  public void onpredicateSliced(final XAbstractWhileExpression theSrc, final XExpression theTgt) {
  }
  
  public void onbodySliced(final XAbstractWhileExpression theSrc, final XExpression theTgt) {
  }
  
  public void ontypeSliced(final XTypeLiteral theSrc, final JvmType theTgt) {
  }
  
  public void ontypeSliced(final XInstanceOfExpression theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onexpressionSliced(final XInstanceOfExpression theSrc, final XExpression theTgt) {
  }
  
  public void onexpressionSliced(final XThrowExpression theSrc, final XExpression theTgt) {
  }
  
  public void onexpressionSliced(final XTryCatchFinallyExpression theSrc, final XExpression theTgt) {
  }
  
  public void onfinallyExpressionSliced(final XTryCatchFinallyExpression theSrc, final XExpression theTgt) {
  }
  
  public void oncatchClausesSliced(final XTryCatchFinallyExpression theSrc, final XCatchClause theTgt) {
  }
  
  public void onexpressionSliced(final XCatchClause theSrc, final XExpression theTgt) {
  }
  
  public void ondeclaredParamSliced(final XCatchClause theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void onassignableSliced(final XAssignment theSrc, final XExpression theTgt) {
  }
  
  public void onvalueSliced(final XAssignment theSrc, final XExpression theTgt) {
  }
  
  public void onexpressionSliced(final XReturnExpression theSrc, final XExpression theTgt) {
  }
  
  public void onexpressionSliced(final XSynchronizedExpression theSrc, final XExpression theTgt) {
  }
  
  public void onparamSliced(final XSynchronizedExpression theSrc, final XExpression theTgt) {
  }
  
  public void onarrayTypeSliced(final JvmComponentType theSrc, final JvmArrayType theTgt) {
  }
  
  public void oncomponentTypeSliced(final JvmArrayType theSrc, final JvmComponentType theTgt) {
  }
  
  public void onsuperTypesSliced(final JvmDeclaredType theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onmembersSliced(final JvmDeclaredType theSrc, final JvmMember theTgt) {
  }
  
  public void ondeclaratorSliced(final JvmTypeParameter theSrc, final JvmTypeParameterDeclarator theTgt) {
  }
  
  public void ontypeParametersSliced(final JvmTypeParameterDeclarator theSrc, final JvmTypeParameter theTgt) {
  }
  
  public void onconstraintsSliced(final JvmConstraintOwner theSrc, final JvmTypeConstraint theTgt) {
  }
  
  public void ontypeReferenceSliced(final JvmTypeConstraint theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onownerSliced(final JvmTypeConstraint theSrc, final JvmConstraintOwner theTgt) {
  }
  
  public void onliteralsSliced(final JvmEnumerationType theSrc, final JvmEnumerationLiteral theTgt) {
  }
  
  public void onargumentsSliced(final JvmParameterizedTypeReference theSrc, final JvmTypeReference theTgt) {
  }
  
  public void ontypeSliced(final JvmParameterizedTypeReference theSrc, final JvmType theTgt) {
  }
  
  public void oncomponentTypeSliced(final JvmGenericArrayTypeReference theSrc, final JvmTypeReference theTgt) {
  }
  
  public void ontypeSliced(final JvmAnyTypeReference theSrc, final JvmType theTgt) {
  }
  
  public void ondeclaringTypeSliced(final JvmMember theSrc, final JvmDeclaredType theTgt) {
  }
  
  public void onlocalClassesSliced(final JvmFeature theSrc, final JvmGenericType theTgt) {
  }
  
  public void ontypeSliced(final JvmField theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onparametersSliced(final JvmExecutable theSrc, final JvmFormalParameter theTgt) {
  }
  
  public void onexceptionsSliced(final JvmExecutable theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onreturnTypeSliced(final JvmOperation theSrc, final JvmTypeReference theTgt) {
  }
  
  public void ondefaultValueSliced(final JvmOperation theSrc, final JvmAnnotationValue theTgt) {
  }
  
  public void onparameterTypeSliced(final JvmFormalParameter theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onannotationsSliced(final JvmAnnotationTarget theSrc, final JvmAnnotationReference theTgt) {
  }
  
  public void onannotationSliced(final JvmAnnotationReference theSrc, final JvmAnnotationType theTgt) {
  }
  
  public void onexplicitValuesSliced(final JvmAnnotationReference theSrc, final JvmAnnotationValue theTgt) {
  }
  
  public void onoperationSliced(final JvmAnnotationValue theSrc, final JvmOperation theTgt) {
  }
  
  public void onvaluesSliced(final JvmTypeAnnotationValue theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onvaluesSliced(final JvmAnnotationAnnotationValue theSrc, final JvmAnnotationReference theTgt) {
  }
  
  public void onvaluesSliced(final JvmEnumAnnotationValue theSrc, final JvmEnumerationLiteral theTgt) {
  }
  
  public void ondelegateSliced(final JvmDelegateTypeReference theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onequivalentSliced(final JvmSpecializedTypeReference theSrc, final JvmTypeReference theTgt) {
  }
  
  public void ontypeSliced(final JvmCompoundTypeReference theSrc, final JvmType theTgt) {
  }
  
  public void onreferencesSliced(final JvmCompoundTypeReference theSrc, final JvmTypeReference theTgt) {
  }
  
  public void onouterSliced(final JvmInnerTypeReference theSrc, final JvmParameterizedTypeReference theTgt) {
  }
  
  protected void onStart() {
  }
  
  protected void onEnd() {
  }
}
