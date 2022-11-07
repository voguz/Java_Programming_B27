package day01_for_practice;

public class Average {
    public static void main(String[] args) {
        double[] listPrice = {13.55, 12.25, 14.55, 10.45};
        double sumOfPrice = 0;

        for (double eachPrice : listPrice) {
            sumOfPrice += eachPrice;
        }


        System.out.println(sumOfPrice / listPrice.length);


    }
}
