package day01_for_practice;

import java.util.Scanner;

public class ForLoopsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors = "";

        while (numOfColors < 3){
            System.out.println("Enter the next color");
            String inputColor = input.nextLine().toLowerCase();

            if (!colors.contains(inputColor)){
                colors+= " " + inputColor;
                numOfColors++;

            }


        }


        System.out.println(colors.trim());

    }
}



