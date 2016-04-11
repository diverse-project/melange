package simplefsmtest.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import simplefsmtest.FsmMT;
import simplefsmtest.fsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public class FsmAdapter extends ResourceAdapter implements FsmMT {
  public FsmAdapter() {
    super(simplefsmtest.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new simplefsmtest.fsm.adapters.fsmmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
