package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        BankRunner bankRunner = new BankRunner();
        bankRunner.accountDetails();

    }

    private void accountDetails() {
        try(Scanner scanner = new Scanner(System.in);){
            int choice = 0;
            Account bankingSystem = new Account();
            while (choice != 5) {
                System.out.println("_________________________________________________________________________");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Check Balance");
                System.out.println("4. Statements");
                System.out.println("5. exit \n");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount to deposit : ");
                        bankingSystem.deposit(scanner.nextInt());
                        break;

                    case 2:
                        System.out.println("Enter Amount to Withdraw : ");
                        bankingSystem.withdrawal(scanner.nextInt());
                        break;

                    case 3:
                        System.out.println("Current Balance ");
                        bankingSystem.checkBalance();
                        break;
                    case 4:
                        bankingSystem.showStatements();
                        break;

                    case 5:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
