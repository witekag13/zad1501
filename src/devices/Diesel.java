package devices;

public class Diesel extends Car {
    public Diesel(String producent, String model, int yearOfProduction, double engine, int vMax, double worth) {
        super(producent, model, yearOfProduction, engine, vMax, worth);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Diesel car");
    }
}
