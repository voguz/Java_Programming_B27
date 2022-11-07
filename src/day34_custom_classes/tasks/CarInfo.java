package day34_custom_classes.tasks;

public class CarInfo {
    public static void main(String[] args) {
        Car vehicle = new Car();
        vehicle.model = "Lamborghini";
        vehicle.year = 2022;
        vehicle.color = "Orange";
        vehicle.fuel = 77;

        System.out.println(vehicle);
        vehicle.drive();
        vehicle.fillTank();
        vehicle.isLow();
        System.out.println("Gas level is low " + vehicle.isLow());




















    }
}

