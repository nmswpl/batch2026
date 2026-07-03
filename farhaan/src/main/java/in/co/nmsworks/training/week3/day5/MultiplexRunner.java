package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplexRunner {

    public static void main(String[] args) {

        Multiplex multiplex = new Multiplex();

        List<Screen> screens = new ArrayList<>();

        screens.add(new Screen(75, "A"));
        screens.add(new Screen(80, "B"));
        screens.add(new Screen(90, "C"));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MULTIPLEX =====");
            System.out.println("1. Check Availability");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Select Screen");
                    System.out.println("0 == Screen A");
                    System.out.println("1 == Screen B");
                    System.out.println("2 == Screen C");

                    int screenNumber = scanner.nextInt();

                    if (screenNumber >= 0 && screenNumber < screens.size()) {
                        multiplex.checkAvailability(screens, screens.get(screenNumber));
                    } else {
                        System.out.println("Invalid Screen.");
                    }

                    break;

                case 2:

                    System.out.println("Select Screen");
                    System.out.println("0 == Screen A");
                    System.out.println("1 == Screen B");
                    System.out.println("2 == Screen C");

                    screenNumber = scanner.nextInt();

                    if (screenNumber >= 0 && screenNumber < screens.size()) {

                        System.out.print("Enter number of tickets : ");
                        int tickets = scanner.nextInt();

                        multiplex.bookTicket(screens, screens.get(screenNumber), tickets);

                    } else {
                        System.out.println("Invalid Screen.");
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}