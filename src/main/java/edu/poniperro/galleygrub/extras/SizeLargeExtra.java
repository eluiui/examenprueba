package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {

    public SizeLargeExtra() {
    };

    @Override
    public void sumExtras(Comanda order) {
        
        Optional<Double> sizeCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase(Extras.LARGE.name()))
                .map(item -> Extras.LARGE.getPrice())
                .reduce(Double::sum);

        if (sizeCharge.isPresent()) {
            order.updateTotal(sizeCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}
