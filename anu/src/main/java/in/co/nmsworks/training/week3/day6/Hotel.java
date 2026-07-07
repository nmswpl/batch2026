package in.co.nmsworks.training.week3.day6;

import java.util.HashMap;

public class Hotel {
    private HashMap<Integer, Guest> guests = new HashMap<>();
    private int nextId = 101;

    public Guest registerGuest(String name, Receptionist language) {

        Guest guest = new Guest(nextId++, name, language);

        guests.put(guest.getId(), guest);

        System.out.println("Guest ID : " + guest.getId());

        return guest;
    }

    public Guest getGuest(int id) {
        return guests.get(id);
    }
}
