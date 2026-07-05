package in.co.nmsworks.training.week3.day5.hotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<Integer, Guest> guestIdToGuestMap = new HashMap<>();
    private Map<String, Language> supportedLanguages = new HashMap<>();

    public Map<String, Language> getSupportedLanguages() {
        return supportedLanguages;
    }

    public int addNewGuest(String guestName, String preferredLanguage) {
        Guest guest = new Guest();
        guest.setName(guestName);

        Language language = supportedLanguages.get(preferredLanguage.toUpperCase());

        if (language == null) {
            System.out.println("Sorry, we did not support this language.");
            return -1;
        }

        guest.setPreferredLanguage(language);
        int guestId = guest.generateGuestId();
        guestIdToGuestMap.put(guestId, guest);

        return guestId;
    }

    public Guest getGuestById(int guestId) {
        return guestIdToGuestMap.get(guestId);
    }

}
