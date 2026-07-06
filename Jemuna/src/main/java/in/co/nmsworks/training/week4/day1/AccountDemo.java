package in.co.nmsworks.training.week4.day1;

import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {
        Account account = new Savings();
        int[] transactions= {1000, -100, 3000};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Banking Transaction :\n 1. Savings Account \n 2. Wallet ");
        int choice = scanner.nextInt();
        while(true){
            switch (choice){
                case 1 :
                    System.out.println("1 . Withdraw \n 2. Deposit ");
                    int option = scanner.nextInt();
                    if(option == 1){
                        account = new Savings();
                        account.withdraw(3000);
                    }
                    else{
                        account = new Savings();
                        account.deposit(1000);
                    }
                    break;

                case 2 :
                    System.out.println("1 . Withdraw \n 2. Deposit ");
                    int optionWallet = scanner.nextInt();
                    if(optionWallet == 1){
                        account = new Wallet();
                        account.withdraw(100);
                    }
                    else{
                        account = new Wallet();
                        account.deposit(100);
                    }
                    break;
            }
        }
    }

    public void transaction(Account account, int[] transactions){
        for (int transaction : transactions) {
            if(transaction>=0){
                account.deposit(transaction);
                System.out.println(transaction+" has been deposited in your account ");
            }
            else{
                account.withdraw(transaction);
                System.out.println(transaction+" has been withdrawn from your account ");
            }
        }

    }
}
