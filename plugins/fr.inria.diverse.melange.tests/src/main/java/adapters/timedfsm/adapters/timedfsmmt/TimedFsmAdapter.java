package adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import adapters.TimedFsmMT;
import adapters.timedfsmmt.TimedFsmMTFactory;

@SuppressWarnings("all")
public class TimedFsmAdapter extends ResourceAdapter implements TimedFsmMT {
  public TimedFsmAdapter() {
    super(adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public TimedFsmMTFactory getFactory() {
    return new adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTFactoryAdapter() ;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
    this.adaptee.save(null);
  }
}
