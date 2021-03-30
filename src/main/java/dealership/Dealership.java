package dealership;

import cars.Car;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> cars;

    public Dealership(double till) {
        this.till = till;
        this.cars = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public void addToTill(int amount) {
        this.till += amount;
    }

    public void removeFromTill(int amount) {
        this.till -= amount;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public Car sellCar(Car car){
        return this.cars.remove(cars.indexOf(car));
    }

    public void addCar(Car car){
        this.cars.add(car);
        removeFromTill(car.getValue());
    }

    public void repairCar(Car car){
        removeFromTill(car.getDamageCost());
        car.setDamageCost(0);
    }

}
