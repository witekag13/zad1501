package devices;

public class Electric extends Car {
    public Electric(String producent, String model, int yearOfProduction, double engine, int vMax, double worth) {
        super(producent, model, yearOfProduction, engine, vMax, worth);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Electric car");
    }


}
