package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Soundappan",1234,0.0);
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 4)
            {
                System.out.println("1. Deposit");
                System.out.println("2. WithDraw");
                System.out.println("3. Balance");
                System.out.println("4. exit \n");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();
                switch (choice)
                {
                    case 1:
                        double dp=scanner.nextDouble();
                        System.out.println(b1.deposit(dp));
                        break;

                    case 2:
                        double wd= scanner.nextDouble();
                        System.out.println(b1.withdraw(wd));
                        break;

                    case 3:
                       b1.display();
                        break;
                    case 4:
                        System.out.println("Transaction Completed");
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


