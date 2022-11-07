package day01_for_practice;

import java.util.Scanner;

public class pratice_IF_Statement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour = input.nextInt();


        if (hour >= 6 && hour <= 11) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good evening");

        } else if (hour >= 17 && hour <= 23) {
            System.out.println("Good Night");

        } else {
            System.out.println("nothing to say");
        }


    }
}
