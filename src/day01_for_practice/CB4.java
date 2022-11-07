package day01_for_practice;

public class CB4 {
    public static String starOut(String str) {
        char star = '*';
        String NwStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == star) {
                NwStr = str.substring(0, str.indexOf(star) - 1) + str.substring(str.lastIndexOf(star) + 2);

            }
        }

        return NwStr;

    }


    public static void main(String[] args) {


        String str = "abc**123*lf";
        CB4.starOut(str);
        System.out.println(starOut(str));
        System.out.println();
    }
}