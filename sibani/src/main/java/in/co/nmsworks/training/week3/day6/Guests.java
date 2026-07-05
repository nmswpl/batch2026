package in.co.nmsworks.training.week3.day6;

public class Guests {
    private  Integer id ;
    private String name;
    private String preferedLanguage;

    public Guests() {
    }

    public Guests(Integer id, String name, String language) {
        this.id = id;
        this.name = name;
        this.preferedLanguage = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id ;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + preferedLanguage + '\'' +
                '}';
    }
}
