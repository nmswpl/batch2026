package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        MultiplexRunner multiplexRunner = new MultiplexRunner();
        Multiplex multiplex = new Multiplex();
        multiplex.setScreens();
        //System.out.println(multiplex.checkAvailability("screen1"));
        //multiplex.bookTickets("screen1", 4);
        //multiplex.checkAvailability("screen1");

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 3)
            {
                System.out.println("1. Check availability");
                System.out.println("2. Book seats");
                System.out.println("3. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter screen no (screen1/screen2/screen3): ");
                        System.out.flush();
                        String screen = scanner.next();
                        multiplex.checkAvailability(screen);
                        break;

                    case 2:
                        System.out.println("Enter screen no (screen1/screen2/screen3): ");
                        System.out.flush();
                        String bookScreen = scanner.next();
                        System.out.println("Enter noof seats to book: ");
                        System.out.flush();
                        Integer noOfTickets = scanner.nextInt();
                        multiplex.bookTickets(bookScreen, noOfTickets);
                        break;

                    case 3:
                        System.out.println("Thank you");
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
