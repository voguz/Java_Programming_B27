package day01_for_practice;

public class MethodsTest {
    public static void main(String[] args) {
        informationOf("volkan");
        voteAvailble(44, true);

    }

    public static void informationOf(String name) {
        System.out.println("your name is: " + name);
    }


    public static void voteAvailble(int age, boolean isCitizen) {
        if (age >= 21 && isCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }


}

