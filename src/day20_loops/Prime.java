package day20_loops;

public class Prime {
    public static void main(String[] args) {
        /*
        input 11
        prime
        input 10
        not prime
         */
        int n = 11;
        boolean isPrime = true;

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");












    }
}
