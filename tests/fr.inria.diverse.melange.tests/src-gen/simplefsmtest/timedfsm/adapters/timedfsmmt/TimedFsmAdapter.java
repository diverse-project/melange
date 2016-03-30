package simplefsmtest.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import simplefsmtest.TimedFsmMT;
import simplefsmtest.timedfsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public class TimedFsmAdapter extends ResourceAdapter implements TimedFsmMT {
  public TimedFsmAdapter() {
    super(simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFactory() {
    return new simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTFactoryAdapter();
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
