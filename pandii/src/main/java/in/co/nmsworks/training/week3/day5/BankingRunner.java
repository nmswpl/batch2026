package in.co.nmsworks.training.week3.day5;

import java.util.Map;
import java.util.Scanner;

public class BankingRunner
{
    public static void main(String[] args)
    {
        BankingRunner bankingRunner = new BankingRunner();
        bankingRunner.run();
    }

    private void run()
    {
        BankAccount bankAccount=new BankAccount(10000);
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. CheckBalance");
                System.out.println("4. Show Statements");
                System.out.println("5. Exit\n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter amt to deposit");
                        bankAccount.deposit(scanner.nextInt());
                        break;

                    case 2:
                        System.out.println("Enter Withdrawal amt");
                        bankAccount.withDraw(scanner.nextInt());
                        break;

                    case 3:
                        bankAccount.checkBalance();
                        break;

                    case 4:
                        bankAccount.showStatements();
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
