package in.co.nmsworks.training.week2.day3.inheritance;

public class Report {
    protected String header(){
        return "";
    }
    protected String body(){
        return "";
    }
    protected String footer(){
        return "";
    }
    protected String generate() {
        return header() + body() + footer();
    }
}

