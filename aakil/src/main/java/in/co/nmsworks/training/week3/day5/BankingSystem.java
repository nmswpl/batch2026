package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        try {
            BankingSystem bankingSystem = new BankingSystem();
            List<Account> accounts = new ArrayList<>();

            accounts.add(new Account(1));
//        accounts.add(new Account(2));
//        accounts.add(new Account(3));

            int id = 1;

            bankingSystem.deposit(accounts, id, 10_000);
            bankingSystem.deposit(accounts, id, 10_000);
            bankingSystem.withdraw(accounts, id, 500);
            bankingSystem.printStatements(accounts, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printStatements(List<Account> accounts, int id) {
        Account account = accounts.get(id - 1);
        System.out.println("ACCOUNT ID = " + id + " \nBALANCE : " + account.getBalance());
        for (Integer statement : account.getStatements()) {
            System.out.print((statement > 0) ? "DEPOSIT: " : "WITHDREW: ");
            System.out.println(statement);
        }
        System.out.println();
    }

    private void withdraw(List<Account> accounts, int id, int amount) {
        Account account = accounts.get(id - 1);
        if (account.getBalance() < amount){
            System.out.println("INSUFFICIENT BALANCE");
        }else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("WITHDREW : " + amount);
            account.getStatements().add(-amount);
        }
        System.out.println("CURRENT BALANCE : " + account.getBalance());
        System.out.println();
    }

    private void deposit(List<Account> accounts, int id, int amount) {
        Account account = accounts.get(id - 1);
        account.setBalance(account.getBalance() + amount);
        System.out.println("DEPOSITED :: " + amount);
        System.out.println("NEW BALANCE :: " + account.getBalance());
        account.getStatements().add(amount);
        System.out.println();
    }
}
