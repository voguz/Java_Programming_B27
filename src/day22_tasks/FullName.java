package day22_tasks;

public class FullName {
    public static void main(String[] args) {
        /*
        Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS
         */


        String[] names = {"James Bond", "Harry Potter", "Tony Stark"};
        System.out.println("" + names[0].charAt(0) + names[0].charAt(6));
        System.out.println("" + names[1].charAt(0) + names[1].charAt(6));
        System.out.println("" + names[2].charAt(0) + names[2].charAt(5));


    }
}
