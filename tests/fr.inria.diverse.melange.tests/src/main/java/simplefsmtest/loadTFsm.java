package simplefsmtest;

import simplefsmtest.FsmMT;
import simplefsmtest.TimedFsm;

@SuppressWarnings("all")
public class loadTFsm {
  public static FsmMT call() {
    return TimedFsm.load("tests-inputs/models/Simple.fsm").toFsmMT();
  }
}
