package day16_string;

public class SubstringMethods {
    public static void main(String[] args) {

        String s = "infinity";
        //          01234567
        System.out.println(s.substring(0)); // infinity
        System.out.println(s.substring(3)); // inity
        System.out.println(s.substring(5)); // ity
        System.out.println(s.substring(7)); // y

        System.out.println(s.substring(1,6)); // nfini  /6 dahil degil
        System.out.println(s.substring(0,1)); // i
        System.out.println(s.substring(3,7)); // init
        System.out.println(s.substring(3,8)); // inity



    }
}
