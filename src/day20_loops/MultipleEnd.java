package day20_loops;

public class MultipleEnd {
    public static void main(String[] args) {
        /*
        input java
        3
        output javaaaa

        input hello?
        4
        output
        hello?????
         */
        String str = "java";
        int end = 3;

        for (int i = 0; i < end; i++) {// int i = 1; i <= end
            str += str.charAt(str.length() - 1); // the character at the last index
        }
        System.out.println(str);


    }
}
