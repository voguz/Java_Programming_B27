package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        /*
    create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"

   Extra: add your own options
     */

        System.out.println("Enter a number from 1-5 to select your language\n\t1) English\n\t2) Spanish\n\t 3) Turkish\n\t4) Russian\n\t5) French");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("hello, thank for your call");
        } else if (option == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (option == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (option == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (option == 5) {
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("We will use English by default");
        }

    }
}
