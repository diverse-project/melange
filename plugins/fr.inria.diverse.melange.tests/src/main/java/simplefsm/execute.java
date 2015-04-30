package simplefsm;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simplefsm.FsmMT;
import simplefsm.fsmmt.FSM;
import simplefsm.fsmmt.State;
import simplefsm.fsmmt.Transition;

@SuppressWarnings("all")
public class execute {
  public static void call(final FsmMT m) {
    EList<EObject> _contents = m.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final FSM root = ((FSM) _head);
    EList<State> _ownedState = root.getOwnedState();
    final Consumer<State> _function = new Consumer<State>() {
      @Override
      public void accept(final State it) {
        String _name = it.getName();
        String _plus = ("State " + _name);
        InputOutput.<String>println(_plus);
        EList<Transition> _outgoingTransition = it.getOutgoingTransition();
        final Consumer<Transition> _function = new Consumer<Transition>() {
          @Override
          public void accept(final Transition it) {
            String _input = it.getInput();
            String _plus = ("\tTransition " + _input);
            InputOutput.<String>println(_plus);
          }
        };
        _outgoingTransition.forEach(_function);
      }
    };
    _ownedState.forEach(_function);
  }
}
