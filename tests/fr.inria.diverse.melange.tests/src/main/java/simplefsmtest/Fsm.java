/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package simplefsmtest;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import simplefsmtest.FsmMT;

@SuppressWarnings("all")
public class Fsm implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Fsm load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    Fsm mm = new Fsm();
    mm.setResource(res);
    return mm ;
  }
  
  public FsmMT toFsmMT() {
    simplefsmtest.fsm.adapters.fsmmt.FsmAdapter adaptee = new simplefsmtest.fsm.adapters.fsmmt.FsmAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
