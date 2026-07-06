package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Multiplex {
    private String movieName;
    private int availableTickets;
    private int nextSeatNumber = 1;

    public Multiplex(String movieName, int availableTickets) {
        this.movieName = movieName;
        this.availableTickets = availableTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public static void main(String[] args) {
        Multiplex screen1 = new Multiplex("Movie A",10);
        Multiplex screen2 = new Multiplex("Movie B",50);
        Multiplex screen3 = new Multiplex("Movie C",23);

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (true)
            {
                System.out.println("1. Movie A");
                System.out.println("2. Movie B");
                System.out.println("3. Movie C");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        screen1.bookTicket(scanner);
                        break;

                    case 2:
                        screen2.bookTicket(scanner);
                        break;

                    case 3:
                        screen3.bookTicket(scanner);
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                        return;
                }
            }


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void bookTicket(Scanner scanner) {
        System.out.println("Number of Tickets :");
        int noOfTickets = scanner.nextInt();
        if(availableTickets>=noOfTickets)
        {
            availableTickets-=noOfTickets;
            System.out.println("Tickets are available... Hava a good day...");
            for (int i = nextSeatNumber; i <= (noOfTickets+nextSeatNumber-1); i++) {
                System.out.println(getMovieName()+"Seat no :"+i);
            }
            nextSeatNumber=nextSeatNumber+noOfTickets;
        }
        else{
            System.out.println("Seats are unavailable.....\nHave a Good day......");
            System.out.println("Only :"+availableTickets+" are available");

        }
    }
}

