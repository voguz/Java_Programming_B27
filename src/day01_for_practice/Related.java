package day01_for_practice;

public class Related {
    public static void main(String[] args) {
        String fullname1 = "Volkan Oguz";
        String fullname2 = "Olesya OGUZ";

        int space1 = fullname1.indexOf(" ");
        String lastname1 = "" + fullname1.substring(space1);
        System.out.println(lastname1);

        int space2 = fullname2.indexOf(" ");
        String lastname2 = "" + fullname2.substring(space2);
        System.out.println(lastname2);

        if (lastname1.equalsIgnoreCase(lastname2)) {
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }


    }
}
