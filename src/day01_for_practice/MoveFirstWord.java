package day01_for_practice;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "java is a fun language";
        System.out.println(sentence);

        int s1 = sentence.indexOf(" ");
        String word1 = "" + sentence.substring(0, s1);
        String word2 = "" + sentence.substring(s1);
        System.out.println(word2 + " " + word1);


    }
}
