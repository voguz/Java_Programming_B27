package day01_for_practice;
import java.util.Scanner;

public class FixFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a name");
        String name = input.nextLine();
        System.out.println(FirstUp(name));
    }

    public static String FirstUp(String name) {
        name = name.toLowerCase();
        String FirstUp = name.toUpperCase().charAt(0) + name.substring(1);
        return FirstUp;
    }


}
