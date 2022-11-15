package questionsPractice;

import java.util.ArrayList;

public class reverse03 {
    /*
    3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.

 // revWords("apple banana kiwi") -> "kiwi banana apple"
  // revWords("I am John Doe")     -> "Doe John am I"
  // revWords("orange")            -> "orange"

     */
    public static String reverseWord(String str){
        String reverse="";
        String [] words = str.split(" ");
        for (int i = words.length -1; i >=0 ; i--) {
            reverse +=" "+ words[i];

        }

        return reverse.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("apple banana kiwi"));
    }
}
