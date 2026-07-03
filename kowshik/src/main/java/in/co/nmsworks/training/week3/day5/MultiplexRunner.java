package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        runner();
    }

    private static void runner()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;

            Multiplex multiplex = new Multiplex();

            Screen screenA = new Screen(1, "A", 75, 75);
            Screen screenB = new Screen(2, "A", 100, 100);
            Screen screenC = new Screen(3, "A", 50, 50);

            multiplex.getScreenMap().put(1, screenA);
            multiplex.getScreenMap().put(2, screenB);
            multiplex.getScreenMap().put(3, screenC);

            while (choice != 6)
            {
                System.out.println("1. Check availability");
                System.out.println("2. Book tickets");
                System.out.println("3. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                System.out.print("Enter a screen number from (1 - 3): ");
                int screenNumber = scanner.nextInt();

                if(screenNumber > multiplex.getScreenMap().size()) {
                    System.out.println("Invalid screen number!! Please select from 1, 2, 3...");
                    return;
                }

                System.out.println("Enter number of members : ");
                int membersCount = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        multiplex.checkAvailability(membersCount, screenNumber);
                        break;

                    case 2:
                        multiplex.bookTicket(membersCount, screenNumber);
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
