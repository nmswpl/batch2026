package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Movies {


    private int screen1 = 100;
    private int screen2 = 90;
    private int screen3 = 10;

    private int nextSeatScreen1 = 1;
    private int nextSeatScreen2 = 1;
    private int nextSeatScreen3 = 1;

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Movies run = new Movies();
        run.startMultiplex();
    }

    public void startMultiplex() {
        while (true) {
            System.out.println("\n--- MULTIPLEX MENU ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private void bookTicket() {
        System.out.print("PLEASE TELL THE SCREEN NUMBER (1, 2, or 3): ");
        int movieScreen = sc.nextInt();


        int remainingSeats;
        int nextSeat;

        if (movieScreen == 1) {
            remainingSeats = screen1;
            nextSeat = nextSeatScreen1;
        } else if (movieScreen == 2) {
            remainingSeats = screen2;
            nextSeat = nextSeatScreen2;
        } else if (movieScreen == 3) {
            remainingSeats = screen3;
            nextSeat = nextSeatScreen3;
        } else {
            System.out.println("INVALID SCREEN NUMBER ");
            return;
        }


        System.out.print("HOW MANY TICKETS NEEDED? ");
        int noOfTickets = sc.nextInt();

        if (noOfTickets <= 0) {
            System.out.println("Invalid number of tickets.");
            return;
        }


        if (remainingSeats >= noOfTickets) {
            System.out.print("YOUR TICKET NUMBERS ARE: ");


            for (int i = 0; i < noOfTickets; i++) {
                System.out.print(nextSeat + " ");
                nextSeat++;
            }
            System.out.println();


            if (movieScreen == 1) {
                screen1 -= noOfTickets;
                nextSeatScreen1 = nextSeat;
                System.out.println("REMAINING SEATS IN SCREEN 1: " + screen1);
            } else if (movieScreen == 2) {
                screen2 -= noOfTickets;
                nextSeatScreen2 = nextSeat;
                System.out.println("REMAINING SEATS IN SCREEN 2: " + screen2);
            } else {
                screen3 -= noOfTickets;
                nextSeatScreen3 = nextSeat;
                System.out.println("REMAINING SEATS IN SCREEN 3: " + screen3);
            }

        } else {
            System.out.println("SORRY, NOT ENOUGH SEATS. Available seats: " + remainingSeats);
        }
    }

    private void checkAvailability() {
        System.out.println("\n--- CURRENT SEAT AVAILABILITY ---");
        System.out.println("Screen 1 remaining seats: " + screen1);
        System.out.println("Screen 2 remaining seats: " + screen2);
        System.out.println("Screen 3 remaining seats: " + screen3);
    }
}