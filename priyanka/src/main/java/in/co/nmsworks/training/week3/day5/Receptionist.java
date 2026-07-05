package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class Receptionist {

    private Map<Integer, Guest> guestMap = new HashMap<>();
    private int guestId = 1001;

    public Guest registerGuest(String name, Language language) {

        Guest guest = new Guest(guestId++, name, language);

        guestMap.put(guest.getGuestId(), guest);

        System.out.println("Guest Registered Successfully.");
        System.out.println("Guest ID : " + guest.getGuestId());

        return guest;
    }

    public Guest getGuest(int id) {
        return guestMap.get(id);
    }

    public void checkIn(Guest guest) {
        guest.getLanguage().welcome(guest.getName());
    }

    public void checkOut(Guest guest) {
        guest.getLanguage().goodbye(guest.getName());
    }
}
