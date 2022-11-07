package day01_for_practice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your floor?");
        int floor = input.nextInt();

        switch (floor) {
            case 1:
                System.out.println("Looby, StarBucks, Amazon Pick up");
                break;
            case 2:
                System.out.println("NASA, Cydeo, Discover");
                break;
            case 3:
                System.out.println("Uber, Lyft, Chase");
                break;
            case 4:
                System.out.println("Rooftop, Lounge");
                break;
            default:
                System.out.println("Its not available floor");
        }

    }
}
