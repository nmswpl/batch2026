package in.co.nmsworks.training.week3.day6.hotel;

import java.util.Objects;

public class Guest {
    private int id;
    private String name;
    private String language;

    public Guest(String name, String language) {
        this.name = name;
        this.language = language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(name, guest.name) && Objects.equals(language, guest.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, language);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
