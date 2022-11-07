package a1_JavaInterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverse("volkanoguz"));
    }
    public static String reverse(String rev) {

        String reverseword = "";
        for (int i = rev.length() - 1; i >= 0; i--) {
            reverseword += rev.charAt(i);
        }
        return reverseword;
    }

}
