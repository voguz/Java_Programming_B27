package day09_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }

        if (false) {
            System.out.println("Bye"); //its not gonna show up bcs its false
        }

        System.out.println("*********");

        int year = 2020;
        if (year == 2020 || year == 2021) {
            System.out.println("Stay Home");
            System.out.println("Wash your hands");
            System.out.println("Social Distance");
        }

        System.out.println("---------------");

        double price = 29.99;
        if (price >= 20) {
            System.out.println("Free Shipping");
        }
    }
}
