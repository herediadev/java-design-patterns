package main.demo1;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder {

    private final List<AtvPart> parts;

    public PartsOrder() {
        parts = new ArrayList<>();
    }

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public double calculateShipping() {
        final double[] shippingCost = {0};
        parts.forEach(part -> shippingCost[0] = +part.calculateShipping());
        return shippingCost[0];
    }
}
