package in.co.nmsworks.training.week3.day6.automatedReceptionist;


import java.util.HashMap;
import java.util.Map;

public class AutomatedReceptionist {
    private Map<String, Guest> guestDatabase = new HashMap<>();
    private int counter = 100;

    public String registerGuest(String name, Language language) {
        counter++;
        String uniqueId = "G" + counter;
        Guest newGuest = new Guest(uniqueId, name, language);
        guestDatabase.put(uniqueId, newGuest);
        System.out.println("[System] Registered new guest: " + name + " -> Assigned ID: " + uniqueId);
        return uniqueId;
    }

    public void processCheckIn(String guestId) {
        Guest guest = guestDatabase.get(guestId);
        if (guest != null) {
            System.out.print("CheckIn Routine -> ");
            guest.getPreferredLanguage().welcome(guest.getName());
        } else {
            System.out.println("CheckIn Error: Invalid Guest ID '" + guestId + "'");
        }
    }

    public void processCheckOut(String guestId) {
        Guest guest = guestDatabase.get(guestId);
        if (guest != null) {
            System.out.print("CheckOut Routine -> ");
            guest.getPreferredLanguage().goodbye(guest.getName());
        } else {
            System.out.println("CheckOut Error: Invalid Guest ID '" + guestId + "'");
        }
    }
}