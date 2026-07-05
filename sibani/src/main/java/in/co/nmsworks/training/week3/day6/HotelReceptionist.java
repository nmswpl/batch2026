package in.co.nmsworks.training.week3.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReceptionist {

    private Map<Integer, Guests> guestsMap = new HashMap<>();
    private int id = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HotelReceptionist receptionist = new HotelReceptionist();

        while (true) {
            System.out.println("\nWelcome to our Hotel Reception");
            System.out.println("1. New Guests");
            System.out.println("2. Existing Guests");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Guest name : ");
                    String name = scanner.nextLine();
                    System.out.print("Preferred Language (English/Tamil/Hindi) : ");
                    String preferedLanguage = scanner.nextLine();
                    int guestId = receptionist.register(name, preferedLanguage);
                    System.out.println("1. CheckIn");
                    System.out.println("2. CheckOut");
                    System.out.print("Enter Visit Type : ");
                    int visit = scanner.nextInt();
                    scanner.nextLine();
                    if (visit == 1) {
                        receptionist.login(guestId);
                    } else if (visit == 2) {
                        receptionist.logOut(guestId);
                    } else {
                        System.out.println("Invalid Visit Type");
                    }
                    break;

                case 2:
                    System.out.print("Enter Guest ID : ");
                    int existingId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("1. CheckIn");
                    System.out.println("2. CheckOut");
                    System.out.print("Enter Visit Type : ");
                    int existingVisit = scanner.nextInt();
                    scanner.nextLine();
                    if (existingVisit == 1) {
                        receptionist.login(existingId);
                    } else if (existingVisit == 2) {
                        receptionist.logOut(existingId);
                    } else {
                        System.out.println("Invalid Visit Type");
                    }
                    break;

                case 3:
                    System.out.println("Thank You...Visit Again...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public int register(String name, String languagePrefered) {

        switch (languagePrefered.trim().toLowerCase()) {
            case "tamil":
                languagePrefered = "tamil";
                break;

            case "hindi":
                languagePrefered = "hindi";
                break;

            case "english":
                languagePrefered = "english";
                break;

            default:
                System.out.println("Invalid language. Defaulting to English.");
                languagePrefered = "english";
        }
        Guests guest = new Guests(id, name, languagePrefered);
        guestsMap.put(id, guest);
        System.out.println("Guest registered successfully");
        System.out.println("Guest ID : " + id);
        return id++;
    }

    public void login(int id) {

        Guests guest = guestsMap.get(id);
        if (guest != null) {
            Language language;
            switch (guest.getPreferedLanguage()) {

                case "tamil":
                    language = new Tamil();
                    break;

                case "hindi":
                    language = new Hindi();
                    break;

                default:
                    language = new English();
            }
            language.checkIn(guest.getName());

        } else {
            System.out.println("Guest ID not found");
        }
    }

    public void logOut(int id) {

        Guests guest = guestsMap.get(id);

        if (guest != null) {

            Language language;

            switch (guest.getPreferedLanguage()) {

                case "tamil":
                    language = new Tamil();
                    break;

                case "hindi":
                    language = new Hindi();
                    break;

                default:
                    language = new English();
            }
            language.checkOut(guest.getName());

        } else {
            System.out.println("Guest ID not found");
        }
    }

}
