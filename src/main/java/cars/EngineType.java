package cars;

public enum EngineType {

    PETROL("Petrol"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid");

    private final String fuel;

    EngineType(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }
}
