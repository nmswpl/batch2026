package in.co.nmsworks.training.week2.day3;

public class Report {
    public String header(){
        return "This a generated header";
    }
    public String body(){
        return "This a generated body";
    }
    public String footer(){
        return "This is a generated footer";
    }
    public String generate(){
        return header() + body() + footer();
    }
}
