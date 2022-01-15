package devices;

public abstract class Device {
    private final String producent;
    private final String model;
    private final int yearOfProduction;

    public Device(String producent, String model, int yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract void turnOn();
}
