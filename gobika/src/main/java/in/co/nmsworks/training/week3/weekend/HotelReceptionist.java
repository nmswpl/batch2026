package in.co.nmsworks.training.week3.weekend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReceptionist {
    private static Integer count = 1000;
    private static Map<String, GuestDetails> guestDetails = new HashMap<>();

    public static void main(String[] args) {
        HotelReceptionist hotelReceptionist = new HotelReceptionist();
        hotelReceptionist.checkGuestExists("Gobika", "English");
        hotelReceptionist.checkGuestExists("Roshika", "English");
        for (Map.Entry<String, GuestDetails> guest : guestDetails.entrySet()) {
            System.out.println(guest.getKey()+" "+guest.getValue());
        }
    }


    private void checkGuestExists(String name,String preferredLanguage) {
        if (!guestDetails.containsKey(name)){
            String guestId = "GST";
            guestId += ++count;
            boolean isCheckin = true;
            guestDetails.put(name, new GuestDetails(name,preferredLanguage,guestId,isCheckin));

        }

        if (guestDetails.get(name).getCheckin()){
            System.out.println("Welcome in preferred language " + preferredLanguage);
            guestDetails.get(name).setCheckin(false);
        }
        else {
            System.out.println("Thank you in preferred language " + preferredLanguage);
            guestDetails.get(name).setCheckin(false);

        }


    }


}
