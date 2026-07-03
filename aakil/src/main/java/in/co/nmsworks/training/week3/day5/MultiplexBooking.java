package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexBooking {
    public static void main(String[] args) {
        Multiplex multiplex = new Multiplex();

        multiplex.addScreen(100, "Project Hail Mary");
        multiplex.addScreen(110, "Interstellar");
        multiplex.addScreen(100, "Minions");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4){
            System.out.println("1. SHOW SCREENS");
            System.out.println("2. BOOK TICKET");
            System.out.println("3. CHECK SEAT AVAILABILITY");
            System.out.println("4. EXIT");

            System.out.print("ENTER CHOICE :: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n\n\n\n");
                    multiplex.displayScreens();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("ENTER NUMBER OF SEATS TO BOOK : ");
                    int numOfTickets = scanner.nextInt();
                    System.out.println("ENTER SCREEN ID : ");
                    int screenId = scanner.nextInt();
                    multiplex.bookSeats(numOfTickets, screenId);
                    break;
                case 3:
                    System.out.println("ENTER SCREEN ID : ");
                    int id = scanner.nextInt();
                    System.out.println("AVAILABLE SEATS : " + multiplex.getAvailableSeats(id));
                    break;
                case 4:
                    System.out.println("Thank you !!");
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }
}
