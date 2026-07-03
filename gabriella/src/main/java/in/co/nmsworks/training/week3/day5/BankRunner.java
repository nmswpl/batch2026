package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {

        BankAccount bankingSystem = new BankAccount();
        // System.out.println(bankingSystem.checkBalance());
        // bankingSystem.deposit(50000);
        // bankingSystem.withdraw(2000);
        // System.out.println(bankingSystem.checkBalance());
        // bankingSystem.getStatements();

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 5)
            {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Print statements");
                System.out.println("5. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        System.out.flush();
                        Integer number = scanner.nextInt();
                        bankingSystem.deposit(number);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw ");
                        System.out.flush();
                        Integer amount = scanner.nextInt();
                        bankingSystem.withdraw(amount);
                        break;

                    case 3:
                        System.out.println("Balance: " + bankingSystem.checkBalance());
                        break;

                    case 4:
                        bankingSystem.getStatements();
                        break;


                    case 5:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }


        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
