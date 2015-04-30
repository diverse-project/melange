package simplefsm;

import simplefsm.Fsm;
import simplefsm.FsmMT;
import simplefsm.TimedFsm;
import simplefsm.execute;

@SuppressWarnings("all")
public class main {
  public static void call() {
    final Fsm m1 = Fsm.load("input/Simple.fsm");
    TimedFsm _load = TimedFsm.load("input/Simple.timedfsm");
    final FsmMT m2 = _load.toFsmMT();
    execute.call(m1.toFsmMT());
    execute.call(m2);
  }
  
  public static void main(final String[] args) {
    StandaloneSetup.doSetup() ;
    call() ;
  }
}
