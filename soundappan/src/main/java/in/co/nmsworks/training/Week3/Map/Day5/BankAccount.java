package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private Integer accountNumber;
    private double balance;
    private List<Transaction> statements;

    public BankAccount(String accountHolder, Integer accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.statements = new ArrayList<>();
    }

    public double deposit(double value) {
        if (value > 0) {
            balance += value;
            statements.add(new Transaction("deposit", value, balance));
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            statements.add(new Transaction("withdraw", amount, balance));
        } else {
            System.out.println(" invalid amount");
        }
        return balance;
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
        for (Transaction t : statements) {
            System.out.println(t);
        }
    }
}