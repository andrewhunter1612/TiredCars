package cars.components;

import behaviours.ICar;

public class Tyre implements ICar {
    private String material;

    public Tyre(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
