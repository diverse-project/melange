package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import com.google.common.base.Objects;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;

@SuppressWarnings("all")
public abstract class Token {
  public ActivityNode holder;
  
  public Token transfer(final ActivityNode holder) {
    boolean _notEquals = (!Objects.equal(this.holder, null));
    if (_notEquals) {
      this.withdraw();
    }
    this.holder = holder;
    return this;
  }
  
  public void withdraw() {
    boolean _isWithdrawn = this.isWithdrawn();
    boolean _not = (!_isWithdrawn);
    if (_not) {
      ActivityNodeAspect.removeToken(this.holder, this);
      this.holder = null;
    }
  }
  
  public boolean isWithdrawn() {
    return Objects.equal(this.holder, null);
  }
}
