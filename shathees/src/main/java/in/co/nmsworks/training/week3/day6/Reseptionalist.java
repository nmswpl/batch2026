package in.co.nmsworks.training.week3.day6;

import java.util.*;

public class Reseptionalist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Guest> guests = new HashMap<>();

        int guestId = 1001;

        while (true) {

            System.out.println("\n1. New Guest");
            System.out.println("2. Existing Guest");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Thank You!");
                break;
            }

            Guest guest = null;

            if (choice == 1) {

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Language (English/Tamil): ");
                String language = sc.nextLine();

                guest = new Guest(guestId, name, language);
                guests.put(guestId, guest);

                System.out.println("Guest Registered Successfully");
                System.out.println("Guest ID: " + guestId);

                guestId++;

            } else if (choice == 2) {

                System.out.print("Enter Guest ID: ");
                int id = sc.nextInt();

                guest = guests.get(id);

                if (guest == null) {
                    System.out.println("Guest Not Found!");
                    continue;
                }

            } else {
                System.out.println("Invalid Choice");
                continue;
            }

            System.out.println("\n1. Check In");
            System.out.println("2. Check Out");
            System.out.print("Enter Choice: ");
            int visit = sc.nextInt();

            if (visit == 1) {

                if (guest.getLanguage().equalsIgnoreCase("English"))
                    System.out.println("Welcome!");
                else if (guest.getLanguage().equalsIgnoreCase("Tamil"))
                    System.out.println("Vanakkam! Welcome!");

            } else if (visit == 2) {

                if (guest.getLanguage().equalsIgnoreCase("English"))
                    System.out.println("Thank You! Visit Again.");
                else if (guest.getLanguage().equalsIgnoreCase("Tamil"))
                    System.out.println("Nandri! Meendum vaarungal.");

            } else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }





    }





