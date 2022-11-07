package day01_for_practice;

public class prtc1 {
    public static void main(String[] args) {
        /*
//        Count Words
//    Given a sentence determine how many words are in the String.
//        Ex:
//            Input:
//                This has multiple words
//            Output:
//                4
//         */
//        String sentence = "volkan oguz besiktas usa";
//        int space = 1;
//
//        for (int i = 0; i < sentence.length(); i++) {
//
//            if (sentence.charAt(i) == ' ') {
//                space++;
//
//            }
//
//        }
//
//        System.out.print(space);


        /*
        Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
         */

        String v = "ja-va-vol-kan";
        int hece = 1;

        for (int i = 0; i < v.length(); i++) {
            if (v.charAt(i) == '-'){
                hece++;
            }

        }

        System.out.println(hece);


    }
}
