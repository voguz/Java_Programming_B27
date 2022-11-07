package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 1100_000;

        balance -= amountToWithdraw; // balance = balance - amountToWithdraw
        System.out.println("Withdraw: " + amountToWithdraw);

        if (balance >= 0) {
            System.out.println("Account balance is: " + balance);
        }

        if (balance < 0) {
            System.out.println("Over draft penalty");
            System.out.println("Amount due: " + amountToWithdraw * 0.25);

        }


    }
}
