package in.co.nmsworks.training.week3.day5.multiplex;

import java.util.Scanner;


public class MultiplexRunner {
    public static void main(String[] args) {

        MultiplexRunner mr = new MultiplexRunner();
        mr.selectScreen();
    }

    private void screenDetails(Screen screen) {
        try (Scanner sc = new Scanner(System.in)) {
            Multiplex mx = new Multiplex();


            int choice = 0;

            while (choice != 3) {
                System.out.println();
                System.out.println("1. Book Tickets");
                System.out.println("2.Check Availability");
                System.out.println("3. EXIT");
                System.out.println();
                System.out.println("Enter choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("enter no. of tickets needed : ");
                        int noOfTickets = sc.nextInt();
                        mx.bookTickets(screen, noOfTickets);
                        break;

                    case 2:
                        System.out.println("availabe no.of seats : " + mx.checkAvailability(screen));
                        break;

                    case 3:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println();
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void selectScreen() {
        try(Scanner sc = new Scanner(System.in)) {
            Screen s1 = new Screen(100, 20);
            Screen s2 = new Screen(200, 50);
            Screen s3 = new Screen(150, 70);

            int choice = 0;


            while (choice != 4) {
                System.out.println("Screens : ");
                System.out.println("1. screen 1");
                System.out.println("2. screen 2");
                System.out.println("3. screen 3");
                System.out.println("4. EXIT");
                System.out.println();
                System.out.println("Select the screen : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        screenDetails(s1);
                        break;

                    case 2:
                        screenDetails(s2);
                        break;

                    case 3:
                        screenDetails(s3);
                        break;

                    case 4:
                        System.out.println("thank you");

                    default:
                        System.out.println();

                }

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
