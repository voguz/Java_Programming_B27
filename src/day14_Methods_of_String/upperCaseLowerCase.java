package day14_Methods_of_String;

public class upperCaseLowerCase {
    public static void main(String[] args) {
        String word = "SummeR";
        word = word.toUpperCase();
        System.out.println(word);

        System.out.println("************");

        String sentence = "The WORLD is yours";
        System.out.println(sentence.toLowerCase());

        System.out.println("************");

        String s = "       java       ";
        System.out.println(s.length());
        s = s.trim(); // trim() method gets rid of all the extra spaces in the beginning and end of a string
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("************");
        String s2 = "   Multiple words     here      ";
        System.out.println(s2.trim());// trim will remove from beginning and the end NOT middle spaces between words
        int news2 = s2.length();
        System.out.println(news2);




    }
}
