package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public abstract class Extra {

    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }  
    
    public abstract void sumExtras(Comanda order);
}
