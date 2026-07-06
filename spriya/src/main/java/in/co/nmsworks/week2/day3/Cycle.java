package in.co.nmsworks.week2.day3;

public class Cycle extends Vehicle {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}