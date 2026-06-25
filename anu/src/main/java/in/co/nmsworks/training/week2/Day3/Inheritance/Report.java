package in.co.nmsworks.training.week2.Day3.Inheritance;

public class Report {
    public String header(){
        return "header";
    }
    public String body(){
        return "body";
    }
    public String footer(){
        return "footer";
    }
    public String generate(){
        return header() + body() + footer();
    }
}
