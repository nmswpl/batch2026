package in.co.nmsworks.training.week3.weekend;

public class Guest {

    private int id;
    private String name;
    private String preferredLanguage;

    public Guest(int id, String name, String preferredLanguage) {
        this.id = id;
        this.name = name;
        this.preferredLanguage = preferredLanguage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }
}