package in.co.nmsworks.training.week3.day5.hotel;

public class Guest {
    private static int guestId = 1;

    private int id;
    private String name;
    private Language preferredLanguage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public int generateGuestId() {
        return guestId++;
    }
}
