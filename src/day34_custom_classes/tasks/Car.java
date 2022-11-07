package day34_custom_classes.tasks;

public class Car {
    String model;
    int year;
    String color;
    double fuel;

    @Override
    public String toString() {
        return "Car info = " +
                "model : " + model +
                " - year : " + year +
                " - color : " + color +
                " - fuel : " + fuel;
    }

    public void drive() {
        System.out.println("Driving " + model + "\nFuel level at %" + fuel );
        fuel -= 5;
    }

    public void fillTank() {
        System.out.println("Filling Tank is  %" + fuel + " will be maxed at %100");
    }

    public boolean isLow() {
        return fuel < 25 ? true : false;
    }


}
