package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner
{
    public static void main(String[] args)
    {
        MultiplexRunner multiplexRunner=new MultiplexRunner();
        multiplexRunner.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            Multiplex multiplex=new Multiplex();
            int choice = 0;
            while (choice != 3)
            {
                System.out.println("1. Check Availability");
                System.out.println("2. Book Tickets");
                System.out.println("3. Exit\n");


                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter screen number to check availability ");
                        multiplex.checkAvailability(scanner.nextInt());
                        break;

                    case 2:
                        System.out.println("Enter screen and ticket count ");
                        multiplex.BookTicket(scanner.nextInt(), scanner.nextInt());
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
