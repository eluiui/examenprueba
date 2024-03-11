package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;

public class Order implements Comanda {

    private final List<Item> items = new ArrayList<Item>();
    private Double total = 0d;

    public Order() {
    };

    public void addItem(String name, double price) {

        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);
    }

    public void addItem(String name, double price, String extra) {

        Item item = ItemFactory.getItem(name, price, extra);
        this.items.add(item);
    }

    int size() {
        return this.items.size();
    }

    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    public Double getTotal() {
        return this.total;
    }

    public void updateTotal(Double total) {
        this.total += total;
    }

    public void display() {
        System.out.print("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }
}
