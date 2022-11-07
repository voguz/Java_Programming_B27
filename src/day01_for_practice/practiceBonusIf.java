package day01_for_practice;

import java.util.Scanner;

public class practiceBonusIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your sales amount?");
        int salesAmount = input.nextInt();

        if (salesAmount < 1000) {
            System.out.println("NO BONUS");

        } else if (salesAmount > 1000 && salesAmount < 1500) {
            System.out.println("You Get Bonus $50");

        } else if (salesAmount > 1500) {
            System.out.println("You Get Bonus $75");

        }
    }
}
