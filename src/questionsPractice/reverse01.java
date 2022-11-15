package questionsPractice;

public class reverse01 {

    /*
    1. String reverse.
Write a method that will take one string as an argument and will return the reverse version of this string.

 // reverseStr("apple")  ->elppa
  // reverseStr("John")   ->nhoJ
  // reverseStr("phone")  ->enohp
  // reverseStr("123456") -> "654321"

     */
    public static String reverseMethod(String str){
       String word ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            word +=str.charAt(i);


        }

        return word;
    }

    public static void main(String[] args) {
        System.out.println(reverseMethod("volkan123Oguz456"));
    }

}
