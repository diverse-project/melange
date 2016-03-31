package simplefsmtest.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import simplefsmtest.FsmMT;
import simplefsmtest.fsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public class FsmAdapter extends ResourceAdapter implements FsmMT {
  public FsmAdapter() {
    super(simplefsmtest.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFactory() {
    return new simplefsmtest.fsm.adapters.fsmmt.FsmMTFactoryAdapter();
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
