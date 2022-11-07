package day01_for_practice;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("whats your tall?");
        double size = input.nextDouble();
        String result = "";

        if (size >= 175 && size <= 190) {
            result = "you are tall";
        } else if (size >= 160) {
            result = "You are midium";
        } else if (size >= 150) {
            result = "you are short";
        } else {
            result = "under standarts";

        }
        System.out.println(result);
        System.out.println("*****-*****--***--**");

        boolean x, z = true;
        int y =20;
        x = (y !=10) || (z = false);
        System.out.println(x);
        System.out.println(z);

    }
}
