package day41_Exceptions.bank;

public class Bank {
    double balance;
    public void withdraw(double amount){

        if(amount > balance){
            throw new NotEnoughMoneyException();
        }

        balance -= amount;
        System.out.println("Money withdrawn");
    }




}
