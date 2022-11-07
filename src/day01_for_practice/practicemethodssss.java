package day01_for_practice;

public class practicemethodssss {
    public static void main(String[] args) {


        System.out.println("------------------------------------");
        String word = "Summer"; // 'word' is the reference/name and "Summer" is the value of the String object
        word.toUpperCase(); // the uppercase method makes all the character uppercase, but we didn't do anything with this value
        // nextInt();
        System.out.println(word);
        word = word.toUpperCase(); // this time we make all the characters uppercase, then the String it gives us back(all uppercase), was reassigned into the variable
        System.out.println(word);
        System.out.println(word);

        System.out.println("***-****-****-***-***-****-*-****-*--*");
        String sentence = "hello My NAME is";
        System.out.println(sentence.toLowerCase()); // make a new String that was all lowercase, and then printed it
        System.out.println(sentence); // print the original String, because String is immutable it cannot change
        String lowerVer = sentence.toLowerCase(); // the new object from the method is stored into the new variable
        System.out.println(lowerVer);
        // option3: reassign
        // sentence = sentence.toLowerCase();

        System.out.println("------------------------------------");

        String s = "       java      ";
        System.out.println(s);
        System.out.println(s.length());
        s = s.trim(); // trim() method gets rid of all the extra spaces in the beginning and end of a String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = "  multiple   words   here    ";
        System.out.println(s2.trim()); // trim() will remove from beginning and end, middle spaces will not be touched





    }
}
