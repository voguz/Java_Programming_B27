package day01_for_practice;

public class CountHiPractice {
    public static void main(String[] args) {
        String s = "abhicdhelhilofrhiidayhih";
                  //01234567891011121314

        /*
        how many hi
         */


        int count = 0;

        for (int i = 0; i < s.length() -1 ; i++) {

            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') { // i + 1 checks next char
                count++;


            }
        }
        System.out.println(count);
    }
}
