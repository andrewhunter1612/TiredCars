import behaviours.ICar;
import cars.Car;
import cars.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(Color.RED, 5000);
        car.addNewComponent(new Tyre("Rubber"));
    }

    @Test
    public void checkComponents(){
        assertEquals(1, car.getCarComponents().size());
    }

}
