package day43_abstraction.cars;

public class Tesla extends ElectricCar {
    @Override
    public void start() {
        System.out.println("Key car near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("Tesla charging station");

    }
}
