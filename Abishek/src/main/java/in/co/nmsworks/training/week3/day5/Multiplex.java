package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplex {

    public static void main(String[] args) {

        Screen[] screens = new Screen[5];
        for (int i = 0;i < screens.length; i++)
        {
            screens[i] = new Screen(100,150);
        }
        int numberOfTickets = bookTicket(screens);

    }

    private static void checkAvailability(int numberOfTickets, Screen screens[]) {

        int flag = 0;
        int count = 0;
        String str[] = {"A","B","C","D","E"};
        for (int i = 0; i < screens.length; i++)
        {
            int availableTickets = screens[i].getAvailable_Tickets();
            if(availableTickets >= numberOfTickets) {
                flag = 1;
                screens[i].setAvailable_Tickets(availableTickets-numberOfTickets);
                count = screens[i].getTicket_Number();
                for (int j = 0; j < numberOfTickets; j++) {
                    System.out.println(str[i] + count);
                    count++;
                    flag = 0;
                    screens[i].setTicket_Number(count);
                }
                System.out.println("Your ticket price is "+numberOfTickets*screens[i].getTicket_Price());
                break;
            }
            else {
                System.out.println("Available tickets in "+str[i]+" is "+screens[i].getAvailable_Tickets());
                continue;
            }
        }

        if(flag == 1) System.out.println("Sorry Tickets or not available");
//        else System.out.println();
    }

    private static int bookTicket(Screen screens[]) {

        Scanner in = new Scanner(System.in);
        int choice = 0;
        int numberOfTickets = 0;
        while (choice != 3) {

            String movie = "Spider Man";
            System.out.println("\nYour movie is: "+movie);
            System.out.println("\nEnter 2 for choose number of tickets");
            System.out.println("Enter 3 for exit");
            choice = in.nextInt();

           if (choice == 2 && !movie.equals("")) {
                System.out.println("Enter number of tickets you wanted: ");
                numberOfTickets = in.nextInt();
                checkAvailability(numberOfTickets, screens);
            }

           if (movie.equals("")) {
                System.out.println("Kindly enter a movie you want to be watch");
            }

            if (choice == 3) {
                System.out.println("Thank you for your visit");
                break;
            }
        }
        return numberOfTickets;
    }
}
