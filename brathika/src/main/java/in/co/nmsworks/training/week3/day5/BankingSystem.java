package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystem {
    List<String> statement = new ArrayList<>();
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Account account = new Account();
        bankingSystem.deposit(1000, account);
        bankingSystem.withdraw(500, account);
        bankingSystem.chechBalance(account);
        bankingSystem.statement(account);

    }

    private void statement(Account account) {
        for (String s : account.getStatement()) {
            System.out.println(s);
        }

    }

    private void chechBalance(Account account) {
        System.out.println("\nBalance is "+account.getBalance());
    }

    private void withdraw(double money, Account account) {

        double balance = account.getBalance();
        if (balance > money ) {
            balance -= money;
            account.setBalance(balance);
            statement.add(money+" has been withdrawed from the account. The balance is: "+balance);
            account.setStatement(statement);
        }
        else {
            System.out.println("Insufficient balance");
            statement.add("\n Amount cannot be withdrawed due to insufficient balance");
            account.setStatement(statement);
        }

    }

    private void deposit(double money, Account account) {
        Double balance = account.getBalance();
        balance = balance + money;
        account.setBalance(balance);
        statement.add(money+" is been deposited to account. The balance is: "+balance);
        account.setStatement(statement);
    }

}
