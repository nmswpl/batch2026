package in.co.nmsworks.training.week3.weekend.hotel;

import java.util.HashMap;
import java.util.Map;

public class HotelReceptionist {
    private static Integer count = 1000;
    private static Map<String, GuestDetails> guestDetails = new HashMap<>();

    public static void main(String[] args) {
        HotelReceptionist hotelReceptionist = new HotelReceptionist();
        hotelReceptionist.checkGuestExist("Gobika", "English","");
        hotelReceptionist.checkGuestExist("Roshika", "Tamil","");
        hotelReceptionist.checkGuestExist("Gobika", "Tamil","GST1001");
        hotelReceptionist.checkGuestExist("Gobika", "Tamil","GST1001");
        for (Map.Entry<String, GuestDetails> guest : guestDetails.entrySet()) {
            System.out.println(guest.getKey()+" "+guest.getValue());
        }

    }

    private void checkGuestExist(String name,String preferredLanguage,String guestId) {
        if (guestId == null || guestId.isEmpty()){
            guestId = "GST";
            guestId += ++count;
            boolean isCheckin = true;
            guestDetails.put(guestId, new GuestDetails(name,preferredLanguage,guestId,isCheckin));

        }
        if (guestDetails.get(guestId) == null){
            System.out.println("Guest not found...");
            return;
        }
        English english = new English();
        Tamil tamil = new Tamil();

        if (guestDetails.get(guestId).getCheckin()) {
            if (preferredLanguage.equalsIgnoreCase("English")) {
                getGreetingWelcomeMessage(english);
            } else {
                getGreetingWelcomeMessage(tamil);
            }
            guestDetails.get(guestId).setCheckin(false);
        }
        else {
            if (preferredLanguage.equalsIgnoreCase("English")) {
                    getGreetingThankMessage(english);
                }
            else {
                    getGreetingThankMessage(tamil);
                }
            guestDetails.get(guestId).setCheckin(true);
        }

    }

    private void getGreetingThankMessage(GreetingLanguage language) {
        language.greetingThankMessage();
    }

    private void getGreetingWelcomeMessage(GreetingLanguage language) {
        language.greetingWelcomeMessage();
    }


}
