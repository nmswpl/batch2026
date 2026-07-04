//package in.co.nmsworks.training.week3.day5;
//
//import java.util.Scanner;
//
//public class MultiplexRunner {
//    public static void main(String[] args) {
//        Multiplex multiplex = new Multiplex();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter screen no: ");
//        int screenNo = scan.nextInt();
//        System.out.println("Enter no of tickets: ");
//        int noOfTicket = scan.nextInt();
//        multiplex.bookTickets(noOfTicket, screenNo);
//    }
//}
package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        Multiplex multiplex = new Multiplex();
        try(Scanner scan = new Scanner(System.in)) {
            int choice = 0;
            while (choice != 6)

            {
                System.out.println("\n1. Book Tickets");
                System.out.println("2. Check availability");
                System.out.println("3. Exit\n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Screen No (1-3) ");
                        int screenNo = scan.nextInt();
                        System.out.print("Enter number of tickets: ");
                        int noOfTicket = scan.nextInt();
                        multiplex.bookTickets(noOfTicket, screenNo);
                        break;
                    case 2:
                        System.out.println("enter screen no. ");
                        int sno = scan.nextInt();
                        if(sno == 1){
                           // boolean b = multiplex.checkAvailability(screenNo);
                        }

                }
        }}
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
