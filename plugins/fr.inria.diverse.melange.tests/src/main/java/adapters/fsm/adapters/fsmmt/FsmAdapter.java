package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import adapters.FsmMT;
import adapters.fsmmt.FsmMTFactory;

@SuppressWarnings("all")
public class FsmAdapter extends ResourceAdapter implements FsmMT {
  public FsmAdapter() {
    super(adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public FsmMTFactory getFactory() {
    return new adapters.fsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
    this.adaptee.save(null);
  }
}
