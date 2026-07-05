package in.co.nmsworks.training.week3.day5;

public class Guest {

    private int guestId;
    private String name;
    private Language language;

    public Guest(int guestId, String name, Language language) {
        this.guestId = guestId;
        this.name = name;
        this.language = language;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }
}
