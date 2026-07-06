package in.co.nmsworks.training.week4.day1;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDemo accountDemo = new AccountDemo();
        Account walletAccount = new Wallet(5000, 2000);
        Account savingsAccount = new SavingsAccount(6000, 1500);
        int[] transactions = {1000, -500, 2000, 1500, -700};
        System.out.println("Wallet Account Transactions");
        accountDemo.transaction(walletAccount, transactions);
        System.out.println("**************************************");
        System.out.println("Savings Account Transactions");
        accountDemo.transaction(savingsAccount, transactions);
    }

    private void transaction(Account account, int[] transactions) {
        for (int transaction : transactions) {
            if (transaction > 0) {
                int balance = account.deposit(transaction);
                System.out.println("Available balance : " + balance);
            } else {
                int balance = account.withdraw(-transaction);
                System.out.println("Available balance : " + balance);
            }

        }
    }
}
