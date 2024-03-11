package edu.poniperro.galleygrub.order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;

public class OrderMap {

    private final Map<Item, Integer> itemQuantities = new HashMap<Item, Integer>(); 

    public OrderMap() {};
    
    public void addItem(String name, double price) {

        Item item = ItemFactory.getItem(name, price);
        
        if (itemQuantities.containsKey(item)) { 
            itemQuantities.computeIfPresent(item, (k, quantity) -> quantity + 1);
        } else {
            itemQuantities.put(item, 0);
        }    
    }

    public int itemsNum() {
        return this.itemQuantities.size();
    }

    public int itemQuantity(String itemName) {
        Optional<Map.Entry<Item,Integer>> item = itemQuantities.entrySet().stream()
                    .filter(entry -> entry.getKey().name().equals(itemName))
                    .findAny();
        return item.isPresent()? item.get().getValue(): 0;
    }    
}
