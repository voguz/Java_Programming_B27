package day01_for_practice;

import java.util.Scanner;

public class StringPractice21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is word1?");
        String word1 = input.nextLine().toLowerCase();
        System.out.println("What is word2?");
        String word2 = input.nextLine().toLowerCase();

        if (word1.length() >= 6 && word2.length() >= 6) {
            System.out.println("Valid data");
            String info = ("" + word1.substring(0, 4) + word2.substring(word2.length() - 3));
            System.out.println(info + "@cydeo.com");
        } else {
            System.out.println("invalid Data");
        }


    }
}
