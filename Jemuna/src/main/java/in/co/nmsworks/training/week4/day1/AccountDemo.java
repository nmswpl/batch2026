package in.co.nmsworks.training.week4.day1;


import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Account savings = new Savings();
        Account wallet = new Wallet();
        int[] transactions= {1000, -100, 3000};
        System.out.println("Savings Account ");
        accountDemo.transaction(savings, transactions);
        System.out.println("Wallet Account ");
        accountDemo.transaction(wallet,transactions);

    }

    public void transaction(Account account, int[] transactions){
        for (int transaction : transactions) {
            if(transaction>=0){
                account.deposit(transaction);
            }
            else{
                account.withdraw(Math.abs(transaction));
            }
        }

    }
}
