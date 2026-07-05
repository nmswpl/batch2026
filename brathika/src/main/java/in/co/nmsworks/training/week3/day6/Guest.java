package in.co.nmsworks.training.week3.day6;

public class Guest {
    private String id;
    private String name;
    private String preferedLanguage;

    public Guest() {
    }

    public Guest(String id, String name, String preferedLanguage) {
        this.id = id;
        this.name = name;
        this.preferedLanguage = preferedLanguage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferedLanguage() {
        return preferedLanguage;
    }

    public void setPreferedLanguage(String preferedLanguage) {
        this.preferedLanguage = preferedLanguage;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", preferedLanguage='" + preferedLanguage + '\'' +
                '}';
    }
}
