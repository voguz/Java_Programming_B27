package day10_if_statements;

public class LetterType {
    public static void main(String[] args) {
        /*
        ex: p letter
        ex: 6 number
        ex: $ special char

         */
        char character = 'p';

        boolean isLetter = character >= 'A' && character <= 'Z' || (character >= 'a' && character <= 'z');
        boolean isNumber = character >= '0' && character <= '9';

        if (isLetter) {
            System.out.println(character + " is a letter");

        }
        if (isNumber) {
            System.out.println(character + " is a number");
        }

        if (!isLetter && !isNumber) {
            System.out.println(character + " is a special character");

        }


    }
}
