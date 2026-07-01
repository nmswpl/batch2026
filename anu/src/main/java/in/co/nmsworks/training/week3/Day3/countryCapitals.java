package in.co.nmsworks.training.week3.Day3;

public class countryCapitals {
    private String name;

    public countryCapitals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "countryCapitals{" +
                "name='" + name + '\'' +
                '}';
    }
}
