package devices;

public class LPG extends Car {
    public LPG(String producent, String model, int yearOfProduction, double engine, int vMax, double worth) {
        super(producent, model, yearOfProduction, engine, vMax, worth);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling LPG car");
    }
}
