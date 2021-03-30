package cars.components;

import behaviours.ICar;
import cars.EngineType;

public class Engine implements ICar {

    private String engine;

    public Engine(EngineType engine) {
        this.engine = engine.getFuel();
    }

    public String getEngine() {
        return engine;
    }
}
