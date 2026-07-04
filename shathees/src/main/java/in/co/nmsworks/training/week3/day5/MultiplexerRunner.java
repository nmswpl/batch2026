package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class MultiplexerRunner {
    public static void main(String[] args) {
        Multiplex multiplex = new Multiplex(3, 5);
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. Book Ticket");
            System.out.println("2. Check Availability");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String ticket = multiplex.bookTicket();
                    if (ticket != null) {
                        System.out.println("Ticket Booked Successfully: " + ticket);
                    } else {
                        System.out.println("Sorry! No seats available.");
                    }
                    break;

                    case 2:
                    multiplex.checkAvailability();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
