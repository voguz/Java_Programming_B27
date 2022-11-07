package day01_for_practice;

import java.util.Scanner;

public class CamelCasePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a sentence");
        String sentence = input.nextLine().toLowerCase();
        String CamelCase = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                CamelCase += sentence.substring(i + 1, i + 2).toUpperCase();
                i++;
            } else {
                CamelCase += sentence.charAt(i);
            }

        }

        System.out.println(CamelCase);


    }
}
