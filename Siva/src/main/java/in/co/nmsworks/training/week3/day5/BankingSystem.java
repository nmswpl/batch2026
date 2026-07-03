package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        bs.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            Account account = new Account(1000D);
            while (choice != 5)
            {
                System.out.println("1. Deposit");
                System.out.println("2. WithDrawal");
                System.out.println("3. Check Balance");
                System.out.println("4. Statement");
                System.out.println("5. Exit");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount :: ");
                        Double amount = scanner.nextDouble();
                        account.deposit(amount);
                        account.printBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount :: ");
                        amount = scanner.nextDouble();
                        account.withdrawal(amount);
                        account.printBalance();
                        break;

                    case 3:
                        account.printBalance();
                        break;

                    case 4:
                        account.printStatement();
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
