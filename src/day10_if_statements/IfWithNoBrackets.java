package day10_if_statements;

public class IfWithNoBrackets {
    public static void main(String[] args) {

        if (3 < 9){
            System.out.println("First");
            System.out.println("Second");
        }

        if (3 < 9)
            System.out.println("Third"); // this line belong to if.. if is not true this line is not gonna show up

            System.out.println("Fourth"); // this line is free not part of if

    }
}
