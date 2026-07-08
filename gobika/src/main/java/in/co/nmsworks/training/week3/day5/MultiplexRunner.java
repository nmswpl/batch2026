package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        MultiplexRunner multiplexRunner = new MultiplexRunner();
        multiplexRunner.runMultiplex();
    }

    private void runMultiplex() {

        try(Scanner scanner = new Scanner(System.in);){
            int choice = 0;
            Multiplex multiplex = new Multiplex();
            multiplex.setScreenToCapacity();
            while (choice != 4) {
                System.out.println("_________________________________________________________________________");
                System.out.println("1. Show Screens");
                System.out.println("2. Book Tickets");
                System.out.println("3. Check Availability");
                System.out.println("4. exit \n");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        multiplex.getScreen();
                        break;

                    case 2:
                        System.out.println("Select Screens : 1 ,2 , 3 " );
                        Integer screen = scanner.nextInt();
                        multiplex.setScreen(screen);
                        System.out.println("Enter No. of Tickets....");
                        multiplex.bookTicket(screen, scanner.nextInt());
                        break;

                    case 3:
                        System.out.println("Select Screens : 1 ,2, 3 " );
                        Integer screenToCheckAvailable = scanner.nextInt();
                        multiplex.setScreen(screenToCheckAvailable);
                        multiplex.checkAvailable(screenToCheckAvailable);
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }



