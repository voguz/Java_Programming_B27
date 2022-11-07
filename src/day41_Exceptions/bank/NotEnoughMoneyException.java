package day41_Exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(){
        super("Not enough money in the account"); // allows me to define the message part of the exception

    }




}
