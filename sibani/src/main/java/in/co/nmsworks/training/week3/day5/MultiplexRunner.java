package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MultiplexRunner {
    public static void main(String[] args) {
        MultiplexRunner multiplexRunner = new MultiplexRunner();
        multiplexRunner.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Screen A");
            System.out.println("2. Screen B");
            System.out.println("3. Screen C");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            System.out.flush();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Multiplex screenA = new Multiplex(100, "A");
                    screenA.bookTicket();
                    break;
                case 2:
                    Multiplex screenB = new Multiplex(50, "B");
                    screenB.bookTicket();
                    break;
                case 3:
                    Multiplex screenC = new Multiplex(75, "C");
                    screenC.bookTicket();
                    break;
                case 4 :
                    System.out.println("Thank you");
            }
        }
        scanner.close();
    }
}
