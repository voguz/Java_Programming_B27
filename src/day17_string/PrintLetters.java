package day17_string;

public class PrintLetters {
    public static void main(String[] args) {
        char first = 'A';

        while(first <= 'Z'){
            System.out.print(first++);   // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        }

        System.out.println();

        char backwards = 'z';
        while(backwards >='a')
            System.out.print(backwards--);  //zyxwvutsrqponmlkjihgfedcba

    }
}


