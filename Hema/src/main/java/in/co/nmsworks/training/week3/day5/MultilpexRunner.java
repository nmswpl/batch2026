package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultilpexRunner {
    public static void main(String[] args) {
//        Multiplex multiplex = new Multiplex();
//        boolean availability;
//        availability = multiplex.checkAvailability(multiplex.getScreen("A"));
//        System.out.println(availability);
//
//        availability = multiplex.checkAvailability(multiplex.getScreen("B"));
//        System.out.println(availability);
//
//        availability = multiplex.checkAvailability(multiplex.getScreen("C"));
//        System.out.println(availability);
//
//
//
//        multiplex.bookTicket(multiplex.getScreen("C"),1);
//        multiplex.bookTicket(multiplex.getScreen("C"),1);
//        multiplex.bookTicket(multiplex.getScreen("C"),1);
//
//        multiplex.bookTicket(multiplex.getScreen("A"),10);

        MultilpexRunner multilpexRunner = new MultilpexRunner();
        multilpexRunner.run();

    }

    private void run()
    {
        Multiplex multiplex = new Multiplex();
        try (Scanner scanner = new Scanner(System.in))
        {

            int choice = 0;
            while (choice != 3)
            {
                System.out.println("1. BookTicket");
                System.out.println("2. CheckAvailability");
                System.out.println("3. Exit \n");


                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();


                switch (choice)
                {
                    case 1:
                        System.out.println("Enter Screen Name:");
                        String name = scanner.next();
                        System.out.println("Enter No of Tickets: ");
                        Integer noOfTickets = scanner.nextInt();
                        multiplex.bookTicket(multiplex.getScreen(name),noOfTickets);
                        break;

                    case 2:
                        System.out.println("Enter Screen name: ");
                        name = scanner.next();
                        boolean status = multiplex.checkAvailability(multiplex.getScreen(name));
                        if(status)
                        {
                            System.out.println("Available");
                        }
                        else
                        {
                            System.out.println("Full");
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
}
