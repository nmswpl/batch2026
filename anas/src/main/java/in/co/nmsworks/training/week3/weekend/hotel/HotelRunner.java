package in.co.nmsworks.training.week3.weekend.hotel;

import java.util.Scanner;

public class HotelRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Receptionist receptionist = new Receptionist();

        while (true) {

            System.out.println("\n1. New Guest");
            System.out.println("2. Existing Guest");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3)
                break;

            Guest guest = null;

            if (choice == 1) {

                System.out.print("Enter Name : ");
                String name = sc.nextLine();

                System.out.println("Choose Language");
                System.out.println("1. English");
                System.out.println("2. Tamil");

                int lang = sc.nextInt();

                Language language;

                switch (lang) {
                    case 2:
                        language = new Tamil();
                        break;
                    default:
                        language = new English();
                }

                guest = receptionist.registerGuest(name, language);

            } else {

                System.out.print("Enter Guest ID : ");
                int id = sc.nextInt();

                guest = receptionist.getGuest(id);

                if (guest == null) {
                    System.out.println("Guest Not Found");
                    continue;
                }
            }

            System.out.println("\n1. Check In");
            System.out.println("2. Check Out");

            int visit = sc.nextInt();

            if (visit == 1)
                receptionist.checkIn(guest);
            else
                receptionist.checkOut(guest);
        }
    }
}
