package in.co.nmsworks.training.week2.day3;

public class Report
{
    public String header(){
        return "Header";
    }

    public String body(){
        return "Body";
    }

    public String footer(){
        return "Footer";
    }

    public String generate(){
        return header()+"\n"+body()+"\n"+footer();
    }


}
