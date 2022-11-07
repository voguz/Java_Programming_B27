package day01_for_practice;
import java.util.Scanner;

public class LoopsPractice1 {
    public static void main(String[] args) {

            int loops = 0;
            boolean run = true;
            Scanner input = new Scanner(System.in);
            while (run) {
                System.out.println("Select three unique colors for the painting: ");
                String color1 = input.next();
                String color2 = input.next();
                String color3 = input.next();
                if (color1.contains(color2) ||color2.contains(color3)||color1.contains(color3)) {
                    System.out.println("Colors are not unique, select different colors");
                    loops++;
                } else {
                    System.out.println("Selected colors: " + color1 + "," + color2 + ", " + color3);
                    run = false;
                }
            }
        }
    }


