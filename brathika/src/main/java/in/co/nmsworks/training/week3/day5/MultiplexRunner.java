package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            Multiplex multiplex = new Multiplex();
            List<Integer> screen1 = new ArrayList<>();
            List<Integer> screen2 = new ArrayList<>();
            List<Integer> screen3 = new ArrayList<>();
            System.out.println("Enter the screen: ");
            int choice = 0;
            while (choice != 4) {
                System.out.println("Screen 1 = Movie1");
                System.out.println("screen 2 = Movie2");
                System.out.println("Screen 3 = Movie3");
                System.out.println("Exit 4 \n");
                System.out.println("Enter your choice");
                System.out.flush();
                choice = sc.nextInt();

                switch (choice) {
                    case 1:

                        System.out.println("Enter no of tickets: ");
                        int tickets = sc.nextInt();
                        multiplex.screen1bookticket(tickets,screen1);
                        break;

                    case 2:
                        System.out.println("Enter no of tickets: ");
                        int tickets2 = sc.nextInt();
                        multiplex.screen2bookticket(tickets2,screen2);
                        break;

                    case 3:
                        System.out.println("Enter no of tickets: ");
                        int tickets3 = sc.nextInt();
                        multiplex.screen3bookticket(tickets3,screen3);
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Screen unavailable");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
