package in.co.nmsworks.training.week3.day6;

public class Guests {

    private int guestID;
    private String name;
    private String preferedLanguage;

    public Guests(int guestID, String name, String preferedLanguage) {
        this.guestID = guestID;
        this.name = name;
        this.preferedLanguage = preferedLanguage;
    }

    public int getGuestID() {
        return guestID;
    }

    public String getName() {
        return name;
    }

    public String getPreferedLanguage() {

        return preferedLanguage;
    }

}
