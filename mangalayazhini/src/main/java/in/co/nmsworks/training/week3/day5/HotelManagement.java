package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class HotelManagement {

    private Map<Integer, Guest> guestList = new HashMap<>();
    private int currentId = 100;

    public Guest registerGuest(String name, GreetGuest language) {

        Guest guest = new Guest(currentId, name, language);
        guestList.put(currentId, guest);

        System.out.println("Guest Registered Successfully");
        System.out.println("Guest ID : " + currentId);

        currentId++;

        return guest;
    }

    public void checkIn(int guestId) {

        Guest guest = guestList.get(guestId);

        if (guest != null) {
            System.out.println("Check-In : " + guest.getName());
            guest.getLanguage().welcome();
        } else {
            System.out.println("Guest Not Found");
        }
    }

    public void checkOut(int guestId) {

        Guest guest = guestList.get(guestId);

        if (guest != null) {
            System.out.println("Check-Out : " + guest.getName());
            guest.getLanguage().thankYou();
        } else {
            System.out.println("Guest Not Found");
        }
    }
}