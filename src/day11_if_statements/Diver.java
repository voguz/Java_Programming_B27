package day11_if_statements;

public class Diver {
    public static void main(String[] args) {
        /*
        You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
         */

        int tank = 85;
        String message = "";

        if (tank >= 90) {
            message = "Your tank is full";
        } else if (tank >= 80) {
            message = "Still okay";
        } else if (tank >= 70) {
            message = "Dont go too far";
        } else if (tank >= 60) {
            message = "Start to head back";
        } else if (tank >= 50) {
            message = "Be Carefull now you at 50%";
        }
        System.out.println(message);
    }
}
