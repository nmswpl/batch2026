package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Multiplex {
    String[] movie = {"A", "B", "C"};
    int[] seats = {10, 2, 3};
    int ticketCounter = 100;

    void bookDetail(int screen, int rowNo) {
        int index = screen - 1;
        if (seats[index] >= rowNo) {
            seats[index] -= rowNo;
            List<String> bookingTickets = new ArrayList<>();
            for (int i = 0; i < rowNo; i++) {
                char sNum = (char) ('A' + i);
                String ticket = ticketCounter + "" + sNum;
                bookingTickets.add(ticket);
            }

            System.out.println("Movie: " + movie[index]);
            System.out.println("Total Seats Booked: " + rowNo);
            System.out.println("Your Tickets: " + bookingTickets);
            ticketCounter++;
        } else {
            System.out.println("Not enough seats available " + seats[index]);
        }
    }


    void checkAvailability(int screen) {
        int index = screen - 1;
        if (index >= 0 && index < movie.length) {
            System.out.println("Screen number: " + screen + " Movie Name: " + movie[index] + " Available Seats: " + seats[index]);
        } else {
            System.out.println("Invalid screen ");
        }
    }


    public static void main(String[] args) {
        Multiplex multiplex = new Multiplex();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("1. Book Tickets");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter the screen: ");
                    int screen = sc.nextInt();
                    System.out.print("enter number of seats: ");
                    int rowNo = sc.nextInt();
                    multiplex.bookDetail(screen, rowNo);
                    break;

                case 2:
                    System.out.println("enter the screen : ");
                    int screenava = sc.nextInt();
                    multiplex.checkAvailability(screenava);
                    break;

                case 3:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Choice " + choice );
            }
        }
    }
}
