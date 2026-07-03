package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        MultiplexRunner runner = new MultiplexRunner();
        runner.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            Multiplex screen1 = new Multiplex(100);
            Multiplex screen2 = new Multiplex(100);
            Multiplex screen3 = new Multiplex(100);
            int choice = 0;
            while (choice != 3)
            {
                homePatternMethod();
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        screenChoicePattern();
                        System.out.print("Enter your Choice :: ");
                        char ch = scanner.next().charAt(0);
                        System.out.print("Enter Number of Tickets : ");
                        int ticketCount = scanner.nextInt();
                        System.out.println();
                        switch (ch) {
                            case 'A':
                                screen1.bookTickets(ticketCount,'A');
                                break;
                            case 'B':
                                screen2.bookTickets(ticketCount,'B');
                                break;
                            case 'C':
                                screen3.bookTickets(ticketCount,'C');
                                break;
                            default:
                                System.out.println("Screen Choice is not Valid. So you redirect to home section!!");
                        }
                        break;

                    case 2:
                        screenChoicePattern();
                        System.out.print("Enter your Choice :: ");
                        ch = scanner.next().charAt(0);
                        System.out.println();
                        switch (ch) {
                            case 'A':
                                System.out.println("Available Tickets in Screen 1 :: "+screen1.getAvailability());
                                break;
                            case 'B':
                                System.out.println("Available Tickets in Screen 2 :: "+screen2.getAvailability());
                                break;
                            case 'C':
                                System.out.println("Available Tickets in Screen 3 :: "+screen3.getAvailability());
                                break;
                            default:
                                System.out.println("Screen Choice is not Valid. So you redirect to home section!!");
                        }
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

    private static void screenChoicePattern() {
        System.out.println("Avaliable Screens");
        System.out.println("A - screen1 \nB - screen2 \nC - screen3");
    }

    private static void homePatternMethod() {
        System.out.println("=================================== Welcome to SK cinemas ====================");
        System.out.println("1. Book Tickets");
        System.out.println("2. Check Tickets Availability");
        System.out.println("3. Exit");
        System.out.println("============================================================================");
    }

}
