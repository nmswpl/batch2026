package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

import java.util.Scanner;

public class HotelRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Receptionist receptionist = new Receptionist();

        while (true) {

            System.out.println("\n===== HOTEL MENU =====");
            System.out.println("1. Register Guest");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Display Guests");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    receptionist.registerGuest();
                    break;

                case 2:
                    receptionist.checkIn();
                    break;

                case 3:
                    receptionist.checkOut();
                    break;

                case 4:
                    receptionist.displayGuests();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}