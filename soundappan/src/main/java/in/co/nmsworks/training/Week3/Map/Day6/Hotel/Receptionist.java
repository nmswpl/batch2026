package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

import java.util.Scanner;

public class Receptionist {
    private Hotel hotel = new Hotel();
    private Scanner sc = new Scanner(System.in);

    public void registerGuest() {

        System.out.print("Enter Guest Name : ");
        String name = sc.next();

        System.out.println("1. English");
        System.out.println("2. Tamil");
        System.out.println("3. Hindi");

        int choice = sc.nextInt();

        Language language;

        switch (choice) {
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
                language = new English();
        }

        Guest guest = hotel.registerGuest(name, language);

        System.out.println("Guest Registered Successfully");
        System.out.println("Guest ID : " + guest.getGuestId());
    }

    public void checkIn() {

        System.out.print("Enter Guest ID : ");
        int id = sc.nextInt();

        Guest guest = hotel.findGuest(id);

        if (guest != null) {
            guest.getLanguage().welcome(guest.getGuestName());
        } else {
            System.out.println("Guest Not Found");
        }
    }

    public void checkOut() {

        System.out.print("Enter Guest ID : ");
        int id = sc.nextInt();

        Guest guest = hotel.findGuest(id);

        if (guest != null) {
            guest.getLanguage().goodBye(guest.getGuestName());
        } else {
            System.out.println("Guest Not Found");
        }
    }

    public void displayGuests() {
        hotel.displayGuests();
    }
}
