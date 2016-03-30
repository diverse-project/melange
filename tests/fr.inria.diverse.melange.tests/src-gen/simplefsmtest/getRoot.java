package simplefsmtest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simplefsmtest.FsmMT;
import simplefsmtest.fsmmt.fsm.FSM;

@SuppressWarnings("all")
public class getRoot {
  public static FSM call(final FsmMT fsm) {
    EList<EObject> _contents = fsm.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    return ((FSM) _head);
  }
}
