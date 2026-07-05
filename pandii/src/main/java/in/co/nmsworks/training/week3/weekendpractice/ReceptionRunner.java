package in.co.nmsworks.training.week3.weekendpractice;

import java.util.Scanner;

public class ReceptionRunner {
    public static void main(String[] args) {
        Reception reception=new Reception();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1.New Guest");
            System.out.println("\n2.Existing Guest");
            System.out.println("\n3.Exit");
            System.out.println("Enter ur choice");

            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    reception.registerGuest();
                    break;
                case 2:
                    reception.checkGuestExist();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
