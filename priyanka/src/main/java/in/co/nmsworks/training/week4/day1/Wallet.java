package in.co.nmsworks.training.week4.day1;

import java.util.List;

public class Wallet implements Account{
    private int balance = 0;
    public Wallet(int balance) {
        this.balance = balance;
        System.out.println("Wallet. Initial balance: "+balance);
    }

    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public int withdraw(int amount) {
        if((-(amount)>limit())||(-(amount)>balance)){
            System.out.println("amount exceeds transaction limit or insufficient money");
            return  balance;
        }
        balance=balance+amount;
        System.out.println("Amount withdrawed: "+-(amount));
        System.out.println("Current balance: " + balance);
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if(amount>limit()){
            System.out.println("Transaction limit exceeds");
            return balance ;
        }
        balance=balance+amount;
        System.out.println("Amount deposited: "+ amount);
        System.out.println("Current balance: " + balance);

        return balance;
    }
}
