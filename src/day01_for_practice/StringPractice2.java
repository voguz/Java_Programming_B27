package day01_for_practice;

public class StringPractice2 {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, 5));

        System.out.println("***-***-***-*--*-***-****-*-*-****-*");

        String firstname = "VOLKAN";
        String lastname = "OGUZ";
        firstname = firstname.toLowerCase();
        lastname = lastname.toLowerCase();


        String id = ("" + firstname.substring(0, 1).toLowerCase() + lastname.substring(0, 1).toUpperCase() + lastname.substring(1, 3).toLowerCase());
        System.out.println(id + id.length() * 2);


        System.out.println("***-***-***-****-*-*-*-*-*****-****-*-*-***-**");


        String name = "Olesya";
        String lastName = "Oguz";
        String Initial = "" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + " " +  lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(Initial);


    }
}
