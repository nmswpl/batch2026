package in.co.nmsworks.training.week2.day2;

public class Training {
    private int id;
    static int count=1;
    private String name;
    private String names;

    public Training() {
    }

    public Training(String name) {
        id=count++;
        this.name = name;
        this.names=names;
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

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
