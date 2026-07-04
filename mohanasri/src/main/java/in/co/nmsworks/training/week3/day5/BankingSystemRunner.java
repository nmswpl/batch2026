package in.co.nmsworks.training.week3.day5;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class BankingSystemRunner {
    public static void main(String[] args) {
        BankingSystemRunner bs = new BankingSystemRunner();
        BankAccount ba = new BankAccount();
        try (Scanner scan = new Scanner(System.in)) {
            int choice = 1;
            while (choice != 5) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Check Balance");
                System.out.println("4. Show statement");
                System.out.println("5. Exit\n");
                System.out.println(" Enter your choice : ");
                choice = scan.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit : ");
                        int dept = scan.nextInt();
                        ba.deposit(dept);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdrawal : ");
                        int withdraw = scan.nextInt();
                        ba.withdrawal(withdraw);
                        break;

                    case 3:
                        ba.checkBalance();
                        break;

                    case 4:
                        ba.showStatement();
                }

            }
            }catch(Exception e){
            e.printStackTrace();
        }
    }
}
