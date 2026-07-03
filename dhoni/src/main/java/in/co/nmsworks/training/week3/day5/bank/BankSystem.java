package in.co.nmsworks.training.week3.day5.bank;

import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();
        Bank SIB = new Bank(101,"Dhoni",10000,"SBI");

        bankSystem.runBank(SIB);
    }

    private void runBank(Bank bank) {

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 5) {

                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Check Balance");
                System.out.println("4. Show Statements");
                System.out.println("5. Exit");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter deposit : ");
                        int amount = scanner.nextInt();
                        bank.deposit(amount);
                        break;

                    case 2:
                        System.out.println("Enter withDraw : ");
                        int withDraw = scanner.nextInt();
                        bank.withDrawl(withDraw);
                        break;

                    case  3:
                        bank.checkBalance();
                        break;

                    case  4:
                        bank.showStatements();
                        break;

                    case  5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
