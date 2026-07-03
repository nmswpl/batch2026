package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Account {


    private double balance = 0;
    private String statementHistory = "Opening Balance: Rs. 0.0\n";

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Account bank = new Account();
        bank.statements();
    }

    public void statements() {
        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Statements");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    showStatements();
                    break;
                case 5:
                    System.out.println("COMPLETED TRANSACTIONS");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }


    private void deposit() {
        System.out.print("ENTER AMOUNT TO DEPOSIT: Rs. ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);


            statementHistory += "Deposited: +Rs. " + amount + " | Current Balance: Rs. " + balance + "\n";
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    private void withdrawal() {
        System.out.print("ENTER AMOUNT TO WITHDRAW: Rs. ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);


            statementHistory += "Withdrawn: -Rs. " + amount + " | Current Balance: Rs. " + balance + "\n";
        } else {
            System.out.println("SORRY! Insufficient balance.");
        }
    }


    private void checkBalance() {
        System.out.println("YOUR CURRENT BALANCE IS: Rs. " + balance);
    }


    private void showStatements() {
        System.out.println("\n=== TRANSACTION STATEMENT ===");
        System.out.print(statementHistory);
        System.out.println("=============================");
    }
}