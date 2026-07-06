package in.co.nmsworks.training.week3.day5;

public class Guest {

    private int id;
    private String name;
    private GreetGuest language;

    public Guest(int id, String name, GreetGuest language) {
        this.id = id;
        this.name = name;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GreetGuest getLanguage() {
        return language;
    }
}