package in.co.nmsworks.training.week3.weekend;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Receptionist {
    private Map<Integer, Guest> guestMap = new HashMap<>();
    private Map<String, String> checkInMap = new HashMap<>();
    private Map<String, String> checkOutMap = new HashMap<>();
    public Receptionist() {
        checkInMap.put("English", "Welcome");
        checkInMap.put("Tamil", "Vanakkam");
        checkInMap.put("Hindi", "Swagat Hai");
        checkInMap.put("French", "Bonjour");
        checkOutMap.put("English", "Thank you! Goodbye");
        checkOutMap.put("Tamil", "Nandri! Meendum Varuga");
        checkOutMap.put("Hindi", "Dhanyavaad! Alvida");
        checkOutMap.put("French", "Merci! Au revoir");
    }

    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== HOTEL RECEPTIONIST =====");
            System.out.println("1. New Guest");
            System.out.println("2. Existing Guest");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            Guest guest;

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Preferred Language: ");
                String language = sc.nextLine();
                guest = receptionist.registerGuest(name, language);
                System.out.println("Guest Registered Successfully!");
                System.out.println("Guest ID: " + guest.getId());

            } else if (choice == 2) {
                System.out.print("Enter Guest ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                guest = receptionist.getGuest(id);
                if (guest == null) {
                    System.out.println("Guest not found!");
                    continue;
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.println("\n1. CheckIn");
            System.out.println("2. CheckOut");
            System.out.print("Enter visit type: ");
            int visit = sc.nextInt();
            sc.nextLine();
            if (visit == 1) {
                receptionist.checkIn(guest);
            } else if (visit == 2) {
                receptionist.checkOut(guest);
            } else {
                System.out.println("Invalid visit type");
            }
        }
    }

    private Guest registerGuest(String name, String language) {
        int id = guestMap.size() + 1;
        Guest guest = new Guest(id, name, language);
        guestMap.put(id, guest);
        return guest;
    }

    private Guest getGuest(int id) {
        return guestMap.get(id);
    }

    private void checkIn(Guest guest) {
        System.out.println(checkInMap.get(guest.getPreferredLanguage()) + " " + guest.getName());
    }

    private void checkOut(Guest guest) {
        System.out.println(checkOutMap.get(guest.getPreferredLanguage())  + " " + guest.getName());
    }
}