package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private Integer balance = 0;
    List<String> statements = new ArrayList<>();

    public BankAccount() {}

    public BankAccount(Integer balance) {
        this.balance = balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount){
        balance += amount;
        statements.add(amount + " credited");
    }

    public void withdraw(Integer amount){
        if (balance >= amount) {
            balance -= amount;
            statements.add(amount + " debited");
        } else if (balance > 0){
            System.out.println("Amount greater than balance. Cannot withdraw amount.");
        }
        else {
            System.out.println("0 balance. Cannot withdraw amount");
            balance = 0;
        }
    }

    public Integer checkBalance(){
        return balance;
    }

    public void getStatements(){
        System.out.println("Statement: ");
        for (String statement : statements) {
            System.out.println(statement);
        }
        System.out.println("Balance: " + checkBalance());
    }
}
