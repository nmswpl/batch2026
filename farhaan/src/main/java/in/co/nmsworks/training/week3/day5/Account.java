package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private List<String> statement = new ArrayList<>();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void getStatement(){
        System.out.println("The Statement of the account is :: ");
        for (String s : statement) {
            System.out.println(s);
        }
        System.out.println("________________________________________________________________________");
    }

    public void checkBalance(){
        System.out.println("The Available Balance is :: " + balance);
        System.out.println("________________________________________________________________________");
    }

    public void deposit(int amount) {
            balance += amount;
            System.out.println("The amount " + amount + " has been deposited");
            statement.add("The amount " + amount + " has been deposited");
        System.out.println("________________________________________________________________________");
    }
     public void withdrawal(int amount) {
         if (amount > balance) {
             System.out.println("There is not enough amount to withdraw");
             System.out.println("________________________________________________________________________");
         } else {
             balance -= amount;
             System.out.println("The amount " + amount + " has been withdrawed");
             statement.add("The amount " + amount + " has been withdrawed");
             System.out.println("________________________________________________________________________");
         }
     }


}
