package day01_for_practice;

public class Practiceeeee {
    public static void main(String[] args) {

        /*
        Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
         */
        String input = "java";

        for (int i = 0; i < input.length(); i++) {
            int temp = input.charAt(i);
            System.out.print(temp + " ");
        }





    }
}
