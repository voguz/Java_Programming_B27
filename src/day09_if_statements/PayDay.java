package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if (hoursPerWeek > 40) {
            // overtime calculate

            int overtimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40; //calculate normal hour
            netPay += hourlyRate * overtimeHours * 1.5; // + important


        } else {
            // worked under or equal 40 hours, so no overtime

            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Net pay: " + netPay);
        // it is out of else statement also out of if statement


    }
}
