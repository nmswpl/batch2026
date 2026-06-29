package in.co.nmsworks.training.week2.day3.inheritance;

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
    public String generate(){
        return  "-------------------------------------" + "\n"
                +header() + "\n" +
                "-------------------------------------" +
                body() + footer();
    }
}
