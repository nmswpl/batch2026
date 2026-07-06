package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystem {
    private int availableBalance=0;
    private List<String> statements = new ArrayList<>();

    public BankingSystem() {

    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();

        Scanner scanner = new Scanner(System.in);

        try
        {
            int choice = 0;
            while (true)
            {
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawl");
                System.out.println("3. Balance Check");
                System.out.println("4. Show Statements");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        system.deposit(scanner);
                        break;

                    case 2:
                        system.withdrawal(scanner);
                        break;

                    case 3:
                        system.balanceCheck();
                        break;
                    case 4:
                        system.showStatements();
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                        return;
                }
            }


        } catch (Exception e)
        {
            e.printStackTrace();
            scanner.close();
        }

    }

    private void withdrawal(Scanner scanner) {
        System.out.println("Enter the amount to Deposit");
        int amount = scanner.nextInt();
        System.out.println("You are withdrawing "+amount+" from your account");
        availableBalance-=amount;
        System.out.println("Available Balance : "+availableBalance);
        statements.add("Withdrawing an amount of "+amount+" ;Available Balance : "+availableBalance);
    }

    private void showStatements() {
        System.out.println("Statement for your Account ");
        for (String statement : statements) {
            System.out.println(statement);
        }
    }

    private void balanceCheck() {

        System.out.println("Available Balance : "+ availableBalance);
    }

    private  void deposit(Scanner scanner) {
        System.out.println("Enter the amount to Deposit");
        int depositAmount = scanner.nextInt();
        availableBalance+=depositAmount;
        System.out.println("You deposited : "+ depositAmount);
        statements.add("Deposited Amount : "+depositAmount+" "+"Available Balance : "+availableBalance);
    }


}
