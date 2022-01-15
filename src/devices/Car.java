package devices;

public abstract class Car extends Device {
    private double engine;
    private int vMax;
    private double worth;


    public Car(String producent, String model, int yearOfProduction, double engine, int vMax, double worth) {
        super(producent,model,yearOfProduction);
        this.engine = engine;
        this.vMax = vMax;
        this.worth = worth;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getvMax() {
        return vMax;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producent='" + super.getProducent() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", yearOfProduction='" + super.getYearOfProduction() + '\'' +
                ", engine=" + engine +
                ", vMax=" + vMax +
                ", worth=" + worth +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + getProducent() + " " + getModel() + " with engine " + engine);
    }

    public abstract void refuel();

}
