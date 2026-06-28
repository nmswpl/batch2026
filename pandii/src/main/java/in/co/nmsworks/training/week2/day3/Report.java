package in.co.nmsworks.training.week2.day3;

public class Report {
    String header() {
        return "head";
    }

    String body() {
        return "body";
    }

    String footer() {
        return "foot";
    }

    void generate() {
        System.out.println(header()+"\n"+body()+"\n"+footer());
    }
}

