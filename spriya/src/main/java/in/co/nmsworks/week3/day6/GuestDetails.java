package in.co.nmsworks.week3.day6;

import java.util.HashMap;
import java.util.Map;

public class GuestDetails {

    private String name;
    private int guestId;
    private String language;
    private Map<Integer, Map<String, String>> guestDetails = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void generateId() {
        double id = Math.random();

        int finalId = (int) (id * 1000);
        setGuestId(finalId);

        System.out.println("Your Id Is : " + finalId);
    }

    public void generateDetails() {

        Map<String, String> map = new HashMap<>();

        map.put(getName(), getLanguage());

        guestDetails.put(getGuestId(), map);

    }

    public void getDetailsForCheckIn(int id) {

        Map<String, String> nameWithLanguage = guestDetails.get(id);

        if (nameWithLanguage == null) {
            System.out.println("Please Enter Correct ID!!!");
            return;
        }

        String language = "";

        for (String value : nameWithLanguage.values()) {
            language = value;
        }

        selectLanguageForCheckIn(language);

    }

    public void selectLanguageForCheckIn(String language) {

        if (language.equalsIgnoreCase("Tamil")) {

            Tamil tamil = new Tamil();
            tamil.checkIn();

        } else if (language.equalsIgnoreCase("English")) {

            English english = new English();
            english.checkIn();

        } else {

            Hindi hindi = new Hindi();
            hindi.checkIn();

        }

    }

    public void getDetailsForCheckOut(int id) {

        Map<String, String> nameWithLanguage = guestDetails.get(id);

        if (nameWithLanguage == null) {
            System.out.println("Please Enter Correct ID!!!");
            return;
        }

        String language = "";

        for (String value : nameWithLanguage.values()) {
            language = value;
        }

        selectLanguageForCheckOut(language);

    }

    public void selectLanguageForCheckOut(String language) {

        if (language.equalsIgnoreCase("Tamil")) {

            Tamil tamil = new Tamil();
            tamil.checkOut();

        } else if (language.equalsIgnoreCase("English")) {

            English english = new English();
            english.checkOut();

        } else {

            Hindi hindi = new Hindi();
            hindi.checkOut();

        }

    }

    public void displayDetails(int id) {

        Map<String, String> nameWithLanguage = guestDetails.get(id);

        if (nameWithLanguage == null) {
            System.out.println("Please Enter Correct ID!!!");
            return;
        }

        System.out.println("Id\tName\tPreferred Language");

        String name = "";
        String language = "";

        for (Map.Entry<String, String> entry : nameWithLanguage.entrySet()) {
            name = entry.getKey();
            language = entry.getValue();
        }

        System.out.println(id + "\t" + name + "\t" + language);

    }

    public void getId(String name) {

        boolean found = false;

        for (Map.Entry<Integer, Map<String, String>> entry : guestDetails.entrySet()) {

            Map<String, String> map = entry.getValue();

            for (Map.Entry<String, String> stringEntry : map.entrySet()) {

                String guestName = stringEntry.getKey();

                if (name.equalsIgnoreCase(guestName)) {

                    System.out.println("Your Id Is : " + entry.getKey());
                    found = true;

                }

            }

        }

        if (!found) {
            System.out.println("Guest Not Found");
        }

    }

    public void getOldEntry(int id) {

        Map<String, String> nameWithLanguage = guestDetails.get(id);

        if (nameWithLanguage == null) {

            System.out.println("Please Enter Correct ID!!!");
            return;

        }

        String name = "";

        for (String key : nameWithLanguage.keySet()) {
            name = key;
        }

        System.out.println("Hi " + name + " Whether you want to check in or out");

    }

}