package fr.inria.diverse.iot2.iot2.aspects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@SuppressWarnings("all")
public class Offer {
  public List<Token> offeredTokens = new ArrayList<Token>();
  
  public boolean hasTokens() {
    this.removeWithdrawnTokens();
    int _size = this.offeredTokens.size();
    return (_size > 0);
  }
  
  public void removeWithdrawnTokens() {
    final ArrayList<Token> tokensToBeRemoved = new ArrayList<Token>();
    final Consumer<Token> _function = (Token token) -> {
      boolean _isWithdrawn = token.isWithdrawn();
      if (_isWithdrawn) {
        tokensToBeRemoved.add(token);
      }
    };
    this.offeredTokens.forEach(_function);
    this.offeredTokens.removeAll(tokensToBeRemoved);
  }
}
