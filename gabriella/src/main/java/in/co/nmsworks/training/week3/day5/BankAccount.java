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
        balance -= amount;
        statements.add(amount + " debited");
    }

    public Integer checkBalance(){
        return balance;
    }

    public void getStatements(){
        System.out.println("Statement: ");
        for (String statement : statements) {
            System.out.println(statement);
        }
    }
}
