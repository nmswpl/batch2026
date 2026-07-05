package in.co.nmsworks.training.week3.weekend;

public class Guest {
    static Integer idCount = 0;
    private String id;
    private String name;
    private Language preferedLanguage;

    public Guest() {
    }

    public Guest(String name, Language preferedLanguage) {
        idCount += 1;
        id = generateId();
        this.name = name;
        this.preferedLanguage = preferedLanguage;
    }

    private String generateId() {
        return "GU-"+idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Language getPreferedLanguage() {
        return preferedLanguage;
    }

    public void setPreferedLanguage(Language preferedLanguage) {
        this.preferedLanguage = preferedLanguage;
    }

    @Override
    public String toString() {
        return "Guest Details :: [" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ']';
    }
}
