package day01_for_practice;

public class Author {
    public static void main(String[] args) {
        String genre = "Fantasy";
        int pageLenght = 0;
        int sequels = 0;
        int countries = 0;
        double profit = 0;

        switch (genre){
            case "Fantasy" :
                genre = "Fantasy";
                pageLenght = 500;
                sequels = 5;
                profit = 1_000_000 ;
                countries = 50 ;
                break;
            case "Detective" :
                genre = "Detective";
                pageLenght = 350;
                profit = 700.000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction" :
                genre = "Science Fiction";
                pageLenght = 720;
                profit = 900.500;
                sequels = 4;
                countries = 30;
                break;



        }

        System.out.println("genre " + genre + "\nPage lenght " + pageLenght + "\nProfit " + profit + "\nsequels " + sequels + "\nCountries " + countries );








    }
}
