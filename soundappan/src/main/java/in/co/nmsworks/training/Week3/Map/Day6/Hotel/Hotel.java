package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private Map<Integer, Guest> guestMap = new HashMap<>();
    private int guestId = 1001;

    public Guest registerGuest(String name, Language language) {

        Guest guest = new Guest(guestId, name, language);

        guestMap.put(guestId, guest);

        guestId++;

        return guest;
    }

    public Guest findGuest(int id) {
        return guestMap.get(id);
    }

    public void displayGuests() {

        for (Guest guest : guestMap.values()) {
            System.out.println("-----------------------");
            System.out.println("Guest ID : " + guest.getGuestId());
            System.out.println("Guest Name : " + guest.getGuestName());
        }
    }
}