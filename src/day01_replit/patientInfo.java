package day01_replit;

import java.util.Scanner;

public class patientInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal! \nPlease enter your personal information");
        System.out.println("Enter your name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your street");
        String street = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your city name");
        String city = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Are you married");
        boolean marryStatus = input.nextBoolean();
        System.out.println("What is your phone number");
        long personalPhone = input.nextLong();
        System.out.println("What is your work phone");
        long workPhone = input.nextLong();

        System.out.println("Patient personal information" );
        System.out.println("Full name: " + firstName + "  " + lastName );
        System.out.println("Adress :" + street + " " + city + " " + state + " " + zipCode);
        System.out.println("Contact: " + "Work phone : " + workPhone + " " + "personel phone : " + personalPhone);
        System.out.println("email : " + email);
        System.out.println("age : " + age);
        System.out.println("Height : " + height);
        System.out.println("weight : " + weight);
        System.out.println("Married : " + (marryStatus ? "Married" : "Single"));

    }
}
