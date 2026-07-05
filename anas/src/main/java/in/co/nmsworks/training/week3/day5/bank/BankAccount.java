package in.co.nmsworks.training.week3.day5.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    int acNo;
    int balance;
    List<String> statement = new ArrayList<>();

    public BankAccount(int acNo, int balance) {
        this.acNo = acNo;
        this.balance = balance;
    }

    public int getAcNo() {
        return acNo;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int deposit(int amount){

        balance += amount;
        statement.add("deposited" + amount + " :: balance : " + balance);
        System.out.println("amount deposited : " + amount);
        return balance;
    }
    int withdraw(int amount) {
        if (amount < balance) {
            System.out.println("amount exceeds balance");
            System.out.println("your balance is " + balance);
            return balance;
        }
        balance -= amount;
        statement.add("withdrawed " + amount + " :: balance : " + balance);
        System.out.println("amount withdrawed : " + amount);
        return balance;

    }
}
