package in.co.nmsworks.training.week2.day3;

public class Report {

    public String header() {
        return "";
    }

    public String body() {
        return "";
    }

    public String footer() {
        return "";
    }

    public String generateReport() {
        return "\n" + header() + "\n" + body() + "\n" + footer();
    }
}
