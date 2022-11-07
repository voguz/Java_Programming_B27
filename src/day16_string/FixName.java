package day16_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FixName {
    /*

    ask the user to enter their first name
    ask the user to enter their last name

    print both names in proper format

    uppercase first letter + everything lowercase

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First name");
        String firstname = input.nextLine().toLowerCase();
        //firstname = firstname.tolowercase();
        System.out.println("Last name");
        String lastname = input.nextLine().toLowerCase();

        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);

        System.out.println(firstname);
        System.out.println(lastname);


    }
}
