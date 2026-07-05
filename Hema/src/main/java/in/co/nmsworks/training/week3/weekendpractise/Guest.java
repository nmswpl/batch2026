package in.co.nmsworks.training.week3.weekendpractise;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                '}';
    }
}
