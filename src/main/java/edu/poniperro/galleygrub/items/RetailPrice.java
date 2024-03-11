package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

/**
 * Un tipo Enum hubiese hecho el truco
 * pero el dia del examen aun no sabian
 * implementarlo.
 * 
 * Enum crea una instancia de esta clase
 * y no permite nuevas instancias
 * ni acceder a ella salvo a traves
 * de la interfaz del tipo Enum
 */
public class RetailPrice {

    static final Map<String, Double> prices = new HashMap<String, Double>();

    private RetailPrice() {};

    public static void init_prices() {
        prices.put("cheese", 0.25d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("large", 0.50d);
    }

    static Double getPrice(String item) {
        return prices.get(item);
    }  
    
    static boolean contains(String item) {
        return prices.containsKey(item);
    }

    public static void display() {
        prices.entrySet().stream()
                                .forEach(entry -> System.out.println("\t" + entry));
    }
}
