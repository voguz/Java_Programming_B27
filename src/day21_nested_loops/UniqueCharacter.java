package day21_nested_loops;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*
        input = java
        output = jv
        find all unique characters
         */

        String str = "java";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }

            if (count == 1) { // if the counter is 1 the character was only found one time, the character only matched itself
                System.out.println(str.charAt(i));
            }

        }


    }
}

/*
        String str = "java";

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " = ");
            for(int j = 0; j < str.length(); j++){
                //System.out.println(str.charAt(i) + " -> " + str.charAt(j));

                System.out.print("-" + str.charAt(j));
            }
            System.out.println();

        }
 */
