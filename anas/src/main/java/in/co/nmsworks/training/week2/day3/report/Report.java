package in.co.nmsworks.training.week2.day3.report;

public class Report {

    private String h;
    private String b;
    private String f;

    public String header(){
        return null;
    }

    public String body(){
        return null;
    }

    public String footer(){
        return null;
    }

    public String generate(){
        return header() + "\n" + body() + "\n" + footer();
    }

}
