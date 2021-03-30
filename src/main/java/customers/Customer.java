package customers;

import cars.Car;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Car> cars;

    public Customer(double money) {
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public void removeMoney(int amount) {
        this.money -= amount;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void buyCar(Car car){
        this.cars.add(car);
        removeMoney(car.getValue());
    }

    public Car sellCar(Car car) {
        addMoney(car.getValue());
        return this.cars.remove(cars.indexOf(car));

    }
}
