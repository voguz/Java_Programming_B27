package day01_for_practice;
import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a sentence");
        String s = input.nextLine();
        System.out.println(s);
    }
    public static String CamelCase(String s) {
        String sentence = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sentence += s.toUpperCase().charAt(i + 1);
                i++;
            } else {
                sentence += s.charAt(i);
            }
        }
        return sentence;
    }
}
