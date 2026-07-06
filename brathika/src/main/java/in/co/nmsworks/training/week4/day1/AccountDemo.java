package in.co.nmsworks.training.week4.day1;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Account wallet = new Wallet();
        Account savingsAccount = new SavingsAccount();
        int[] transaction = {1000, -400, 2000};
        System.out.println("Wallet");
        accountDemo.transaction(wallet,transaction);
        System.out.println("Savings account");
        accountDemo.transaction(savingsAccount,transaction);


    }

    private void transaction(Account account, int[] transactions) {
        for (int transaction : transactions) {
            if (transaction > 0) {
                int transaction1 = account.deposit(transaction);
                System.out.println("Amount deposit");
                System.out.println("Total balance "+transaction1);
            }
            else {

                int transaction1 =  account.withdraw(Math.abs(transaction));
                System.out.println("Amount withdraw");
                System.out.println(transaction1);
            }
        }
    }
}
