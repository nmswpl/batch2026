package in.co.nmsworks.training.week3.weekend;

import java.util.HashMap;
import java.util.Map;

public class GuestDatabase {
    private final Map<Integer, Guest> guestDB = new HashMap<>();

    public Guest getGuestById(int id){
        return guestDB.get(id);
    }

    public Guest createGuest(String name, Language preferredLanguage){
        int guestId = guestDB.size() + 1;
        Guest guest = new Guest(guestId, name, preferredLanguage);
        guestDB.put(guestId, guest);
        return guest;
    }
}
