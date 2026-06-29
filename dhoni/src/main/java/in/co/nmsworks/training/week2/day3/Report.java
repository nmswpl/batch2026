package in.co.nmsworks.training.week2.day3;

public class Report {
    public Report() {
    }

    public String header() {
        return "Header";
    }

    public String body() {
        return "Body";
    }

    public String footer() {
        return "Footer";
    }

    public void generate() {
        System.out.println(header() + " " + body() + " " + footer());
    }
}


