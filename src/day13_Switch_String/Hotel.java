package day13_Switch_String;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to Java Hotel***");
        System.out.println("How many days will you be staying?");
        int days = input.nextInt();
        System.out.println("How many people do you have in your party?");
        int people = input.nextInt(); //party size
        String roomType;
        double price;

        switch (people) {
            case 1:
                roomType = "Single Room";
                price = days * 100;
                break;
            case 2:
                roomType = "Double Room";
                price = days * 125;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = days * people * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "Suit";
                price = days * 5000;
                break;
            default:
                roomType = "No Rooms available";
                price = 0;
        }

        System.out.println(roomType);
        System.out.println(price);
    }
}
