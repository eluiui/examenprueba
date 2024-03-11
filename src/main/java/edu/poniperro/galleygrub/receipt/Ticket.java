package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {

    Comanda getOrder();

    void setChain(Extra extra); 

    Double total();

    void print();
    
}
