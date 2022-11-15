package questionsPractice;

public class reversePalindrome {
    /*
   // isPal("anna")   -> true
  // isPal("civic")  -> true
  // isPal("apple")  -> false
  // isPal("level")  -> true

     */
    public static Boolean Palindrome(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);
        }
        return reverse.equals(str);
    }
    public static void main(String[] args) {
        System.out.println("Palindrome(\"anna\") = " + Palindrome("anna"));
    }
}
