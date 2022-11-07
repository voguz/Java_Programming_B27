package day01_for_practice;

public class MiddleChar {
    public static void main(String[] args) {

        String word = "elephant";
        int middle = word.length() / 2;
        // System.out.println(middle); //4
        //System.out.println("" + word.charAt(middle)); //h

        if (word.length() % 2 == 0) {
            System.out.println("" + word.charAt(middle - 1) + word.charAt(middle));
        }
        if (word.length() % 2 == 1) {
            System.out.println("" + word.charAt(word.length() / 2));
        }


    }
}
