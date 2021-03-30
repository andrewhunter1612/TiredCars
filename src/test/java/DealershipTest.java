import cars.Car;
import cars.components.Tyre;
import customers.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    private Customer customer;

    @Before
    public void before() {
        dealership = new Dealership(1000);
        car = new Car(Color.RED, 500);
        car.addNewComponent(new Tyre("Rubber"));
        dealership.addCar(car);
    }

    @Test
    public void canAddCar() {
        assertEquals(1, dealership.getCars().size());
        assertEquals(500, dealership.getTill(), 0.0);
    }

    @Test
    public void fixDamagedCar(){
        car.setDamageCost(100);
        dealership.repairCar(car);
        assertEquals(400, dealership.getTill(), 0.0);
        assertEquals(0, car.getDamageCost());
    }

}
