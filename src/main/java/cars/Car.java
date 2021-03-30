package cars;

import behaviours.ICar;

import java.awt.*;
import java.util.ArrayList;

public class Car implements ICar {


    private Color colour;
    private int price, damageCost;
    private ArrayList<ICar> carComponents;

    public Car(Color colour, int price) {
        this.colour = colour;
        this.price = price;
        this.damageCost = 0;
        this.carComponents = new ArrayList<>();
    }



    public void setDamageCost(int damageCost) {
        this.damageCost = damageCost;
    }

    public Color getColour() {
        return colour;
    }

    public int getDamageCost() {
        return damageCost;
    }

    public int getValue() {
        return price - this.damageCost;
    }

    public ArrayList<ICar> getCarComponents() {
        return carComponents;
    }

    public void addNewComponent(ICar component){
        this.carComponents.add(component);
    }
}
