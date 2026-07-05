package in.co.nmsworks.training.week3.weekend;

import java.util.Objects;

public class Guest {
    private int id;
    private String name;
    private Language preferredLanguage;

    public Guest(int id, String name, Language preferredLanguage) {
        this.id = id;
        this.name = name;
        this.preferredLanguage = preferredLanguage;
    }

    public Guest() {
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

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return getId() == guest.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Guest Details : [ " +
                "Unique Id = " + getId() +
                ", Name = '" + getName() + '\'' +
                ", preferredLanguage = " + getPreferredLanguage().getDisplayName() +
                " ]";
    }
}
