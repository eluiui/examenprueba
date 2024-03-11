package edu.poniperro.galleygrub.order;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public interface Comanda {

    void addItem(String name, double price);

    void addItem(String name, double price, String extra);

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double total);

    void display();
    
}
