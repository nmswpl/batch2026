package in.co.nmsworks.training.week3.day6;

public class Guest {
    private  String name;
    private int id=101;
    Receptionist language;

    public Guest(int i, String name, Receptionist language) {
        this.id =id;
        this.name=name;
        this.language=language;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Receptionist getLanguage() {
        return language;
    }

    public void setLanguage(Receptionist language) {
        this.language = language;
    }
}
