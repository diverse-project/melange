package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import simplefsm.FsmMT;
import simplefsm.fsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public class TimedFsmAdapter extends ResourceAdapter implements FsmMT {
  public TimedFsmAdapter() {
    super(simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public FsmFactory getFactory() {
    return new simplefsm.timedfsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
