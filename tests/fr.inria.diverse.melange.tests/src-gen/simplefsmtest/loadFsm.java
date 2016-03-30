package simplefsmtest;

import simplefsmtest.Fsm;
import simplefsmtest.FsmMT;

@SuppressWarnings("all")
public class loadFsm {
  public static FsmMT call() {
    return Fsm.load("tests-inputs/models/Simple.fsm").toFsmMT();
  }
}
