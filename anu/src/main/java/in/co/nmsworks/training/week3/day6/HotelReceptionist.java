package in.co.nmsworks.training.week3.day6;

import in.co.nmsworks.training.week3.day6.Guest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReceptionist {

    static Map<Integer, Guest> guests = new HashMap<>();
    static int guestId = 101;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. New Guest");
        System.out.println("2. Existing Guest");
        int choice = sc.nextInt();
        sc.nextLine();

        Guest guest = null;

        if (choice == 1) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Choose Language");
            System.out.println("1. English");
            System.out.println("2. Tamil");
            System.out.println("3. Hindi");

            int lang = sc.nextInt();

            Receptionist language;

            switch (lang) {
                case 1:
                    language = new English();
                    break;
                case 2:
                    language = new Tamil();
                    break;
                case 3:
                    language = new Hindi();
                    break;
                default:
                    System.out.println("Invalid Language");
                    return;
            }

            guest = new Guest(guestId++, name, language);
            guests.put(guest.getId(), guest);

            System.out.println("Guest Registered Successfully.");
            System.out.println("Guest ID: " + guest.getId());

        } else {

            System.out.print("Enter Guest ID: ");
            int id = sc.nextInt();

            guest = guests.get(id);

            if (guest == null) {
                System.out.println("Guest not found.");
                return;
            }
        }

        System.out.println("1. Check In");
        System.out.println("2. Check Out");

        int visit = sc.nextInt();

        switch (visit) {
            case 1:
                guest.getLanguage().checkIn();
                break;
            case 2:
                guest.getLanguage().checkOut();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}