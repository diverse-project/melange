package strictecore;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import strictecore.__SlicerAspect__;

@SuppressWarnings("all")
public class StrictEcore {
  private final List<EModelElement> inputEModelElement;
  
  private final List<EObject> clonedElts = CollectionLiterals.<EObject>newArrayList();
  
  public final boolean optionlowerTypes;
  
  private final String nameExtension;
  
  public final boolean card1;
  
  private final EObject _root;
  
  public StrictEcore(final List<EModelElement> inputEModelElement, final EObject metamodelRoot, final boolean optionlowerTypes, final String nameExtension, final boolean card1) {
    this.inputEModelElement = inputEModelElement;
    boolean _tripleEquals = (metamodelRoot == null);
    if (_tripleEquals) {
      throw new IllegalArgumentException();
    }
    this._root = metamodelRoot;
    this.optionlowerTypes = optionlowerTypes;
    this.nameExtension = nameExtension;
    this.card1 = card1;
  }
  
  public void slice() {
    __SlicerAspect__.feedOpposites(this._root);
    if (this.inputEModelElement!=null) {
      final Consumer<EModelElement> _function = new Consumer<EModelElement>() {
        public void accept(final EModelElement it) {
          __SlicerAspect__.visitToAddClasses(it, StrictEcore.this);
        }
      };
      this.inputEModelElement.forEach(_function);
    }
    if (this.inputEModelElement!=null) {
      final Consumer<EModelElement> _function_1 = new Consumer<EModelElement>() {
        public void accept(final EModelElement it) {
          __SlicerAspect__.visitToAddRelations(it, StrictEcore.this);
        }
      };
      this.inputEModelElement.forEach(_function_1);
    }
    this.save();
  }
  
  public void objectCloned(final EObject object) {
    this.clonedElts.add(object);
  }
  
  public void save() {
    try {
      final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
        public Boolean apply(final EObject it) {
          EObject _eContainer = it.eContainer();
          return Boolean.valueOf((_eContainer == null));
        }
      };
      final Iterable<EObject> objs = IterableExtensions.<EObject>filter(this.clonedElts, _function);
      final ResourceSetImpl resSet = new ResourceSetImpl();
      Resource.Factory.Registry _resourceFactoryRegistry = resSet.getResourceFactoryRegistry();
      Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      URI _createURI = URI.createURI(("modelSlice." + this.nameExtension));
      final Resource res = resSet.createResource(_createURI);
      EList<EObject> _contents = res.getContents();
      Iterables.<EObject>addAll(_contents, objs);
      Map<Object, Object> _emptyMap = Collections.<Object, Object>emptyMap();
      res.save(_emptyMap);
      res.unload();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void reinit() {
    __SlicerAspect__.reinit(this._root);
  }
}
