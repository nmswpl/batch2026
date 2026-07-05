package in.co.nmsworks.training.week3.day5.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            BankAccount bankAccount = new BankAccount(1, 10000);
            int choice = 0;
            while(choice != 5){
                System.out.println("1. Withdrawal");
                System.out.println("2. Deposit");
                System.out.println("3. Statement");
                System.out.println("4. Check Balance");
                System.out.println("5. EXIT");
                System.out.println();
                System.out.println("enter choice: ");
                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("enter amount to withdraw : ");
                        int amount = sc.nextInt();
                        bankAccount.withdraw(amount);
                        break;

                    case 2:
                        System.out.println("enter amount to deposit : ");
                        int amountToDeposit = sc.nextInt();
                        bankAccount.deposit(amountToDeposit);
                        break;

                    case 3:
                        System.out.println("statement : " );
                        for (String s : bankAccount.statement) {
                            System.out.println(s);
                        }

                    case 4:
                        System.out.println("Balance : " +bankAccount.balance);
                        break;

                    case 5:
                        System.out.println("thank you");
                        break;

                    default:
                        System.out.println("invalid input");



                }
            }
        }

    }
}
