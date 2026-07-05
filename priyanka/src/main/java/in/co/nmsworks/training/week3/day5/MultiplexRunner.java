package in.co.nmsworks.training.week3.day5;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        new MultiplexRunner().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int[] screen1 = new int[10];
        int[] screen2 = new int[10];
        int[] screen3 = new int[10];

        Arrays.fill(screen1, 0);
        Arrays.fill(screen2, 0);
        Arrays.fill(screen3, 0);

        Multiplex m = new Multiplex();
        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter choice : ");
            int selectedChoice = scanner.nextInt();
            switch (selectedChoice) {
                case 1:
                    System.out.println("1. Screen1");
                    System.out.println("2. Screen2");
                    System.out.println("3. Screen3");
                    System.out.print("Enter screen number : ");
                    int screenNumber = scanner.nextInt();
                    System.out.print("Enter number of tickets : ");
                    int ticket = scanner.nextInt();
                    switch (screenNumber) {
                        case 1:
                            m.bookTicket(ticket, screen1);
                            m.showAvailability(screen1);
                            break;
                        case 2:
                            m.bookTicket(ticket, screen2);
                            m.showAvailability(screen2);
                            break;
                        case 3:
                            m.bookTicket(ticket, screen3);
                            m.showAvailability(screen3);
                            break;
                        default:
                            System.out.println("Invalid screen number");
                    }
                    break;
                case 2:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}