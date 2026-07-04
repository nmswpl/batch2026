package in.co.nmsworks.week3.day5;


import java.util.List;
import java.util.Scanner;

public class MainMultiplex {
    public static void main(String[] args) {
        MainMultiplex mainMultiplex = new MainMultiplex();
        mainMultiplex.run();

    }

    private void run() {
        System.out.println("1.Select screen:1.A  2.B  3.C");
        System.out.println("Enter Screen number :");
        try (Scanner scanner = new Scanner(System.in)) {
            int screen = scanner.nextInt();

            if (screen == 1) {
                Multiplex A = new Multiplex(100, "A");

                int choice = 0;

                while (choice != 3) {

                    System.out.println("1. Check Availability of tickets");
                    System.out.println("2. Book Ticekts");
                    System.out.println("3. exit \n");

                    System.out.print("Enter your choice : ");
                    System.out.flush();
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:

                            A.checkAvailability();
                            break;
                        case 2:
                            int tickets = 0;
                            System.out.println("Enter total number of tickets : ");
                            tickets = scanner.nextInt();
                            List<String> available = A.getAvailableSeats();

                            A.bookTickets(available, tickets);
                            A.printtickets();

                            break;
                        case 3:
                            System.out.println("Thank you");
                            break;

                        default:
                            System.out.println("Invalid Choice " + choice);
                    }
                }

            } else if (screen == 2) {
                Multiplex B = new Multiplex(75, "B");

                int choice = 0;

                while (choice != 3) {

                    System.out.println("1. Check Availability of tickets");
                    System.out.println("2. Book Ticekts");

                    System.out.println("3. exit \n");

                    System.out.print("Enter your choice : ");
                    System.out.flush();
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            B.checkAvailability();
                            break;
                        case 2:
                            int tickets = 0;
                            System.out.println("Enter total number of tickets : ");
                            tickets = scanner.nextInt();
                            List<String> available = B.getAvailableSeats();
                            B.bookTickets(available, tickets);
                            B.printtickets();


                        case 3:
                            System.out.println("Thank you");
                            break;

                        default:
                            System.out.println("Invalid Choice " + choice);
                    }
                }


            } else if (screen == 3) {
                Multiplex C = new Multiplex(50, "C");

                int choice = 0;

                while (choice != 3) {

                    System.out.println("1. Check Availability of tickets");
                    System.out.println("2. Book Ticekts");

                    System.out.println("3. exit \n");

                    System.out.print("Enter your choice : ");
                    System.out.flush();
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:

                            C.checkAvailability();
                            break;

                        case 2:
                            int tickets = 0;
                            System.out.println("Enter total number of tickets : ");
                            tickets = scanner.nextInt();
                            List<String> available = C.getAvailableSeats();
                            C.bookTickets(available, tickets);
                            C.printtickets();
                            break;


                        case 3:
                            System.out.println("Thank you");
                            break;

                        default:
                            System.out.println("Invalid Choice " + choice);
                    }
                }
            } else {
                System.out.println("Enter valid screen number");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
