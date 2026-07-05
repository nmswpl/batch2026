package in.co.nmsworks.training.week3.day6;

public class Guest {
    private int guestId;
    private  String  name;
    private  String language;
    //private int guestId;


    public Guest() {

    }

    public Guest(int guestId, String name, String language) {
        this.guestId = guestId;
        this.name = name;
        this.language = language;
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
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public Guest(String name, String language) {
        this.name = name;
        this.language = language;
    }


}
