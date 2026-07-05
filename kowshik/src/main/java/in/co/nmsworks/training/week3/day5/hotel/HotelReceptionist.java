package in.co.nmsworks.training.week3.day5.hotel;

import java.util.Scanner;

public class HotelReceptionist {
    public static void main(String[] args) {
        workflow();
    }

    private static void workflow() {

        try (Scanner scanner = new Scanner(System.in)) {
            Hotel hotel = new Hotel();

            hotel.getSupportedLanguages().put("TAMIL", new Tamil());
            hotel.getSupportedLanguages().put("ENGLISH", new English());

            while (true) {
                System.out.println("Welcome!");
                System.out.println("1. New Guest");
                System.out.println("2. Existing Guest");
                System.out.println("0. Exit");
                System.out.print("Enter your choice : ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    System.out.println("Thank you for visiting!");
                    break;
                }

                Guest guest = null;
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name : ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Preferred Language : ");
                        String language = scanner.nextLine();

                        int guestId = hotel.addNewGuest(name, language);

                        if (guestId == -1) {
                            continue;
                        }

                        System.out.println("Guest Registered Successfully.");
                        System.out.println("Your Guest ID : " + guestId);
                        guest = hotel.getGuestById(guestId);
                        break;

                    case 2:
                        System.out.print("Enter Guest ID : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        guest = hotel.getGuestById(id);
                        if (guest == null) {
                            System.out.println("Guest not found!");
                            continue;
                        }
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                        continue;
                }

                System.out.println("Choose Visit Type");
                System.out.println("1. Check In");
                System.out.println("2. Check Out");
                System.out.print("Enter choice : ");

                int visitChoice = scanner.nextInt();
                scanner.nextLine();

                Language preferredLanguage = guest.getPreferredLanguage();
                switch (visitChoice) {
                    case 1:
                        preferredLanguage.greetMsg(guest.getName());
                        break;

                    case 2:
                        preferredLanguage.exitMsg(guest.getName());
                        break;

                    default:
                        System.out.println("Invalid Visit Type!");
                }
            }
        }
    }

}
