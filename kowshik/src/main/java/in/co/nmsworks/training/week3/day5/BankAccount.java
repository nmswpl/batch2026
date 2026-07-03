package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int id;
    private double balance;
    List<String> statements;

    public BankAccount(double initialAmount) {
        this.balance = initialAmount;
        this.statements = new ArrayList<>();
        statements.add("Initial Amount : " + initialAmount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double amount) {
        balance += amount;
        String statement = "Deposited amount : Rs" + amount;
        statements.add(statement);
        System.out.println(statement);
    }

    public void withdraw(double amountToWithdraw) {
        if (amountToWithdraw > balance) {
            System.out.println("Withdrawal amount is greater than available balance.");
            return;
        }

        balance -= amountToWithdraw;
        String statement = "Amount withdrawn : Rs" + amountToWithdraw;
        statements.add(statement);
        System.out.println(statement);
    }

    public void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    public void printStatements() {
        System.out.println("STATEMENTS : ");
        for (String statement : statements) {
            System.out.println(statement);
        }
    }


}
