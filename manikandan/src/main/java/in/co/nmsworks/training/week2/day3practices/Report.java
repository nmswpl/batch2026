package in.co.nmsworks.training.week2.day3practices;

public class Report {
    String header(){
        return " Head ";
    }
    String body(){
        return " body ";
    }

    String footer(){
        return " foot ";
    }

    String generate(){
         return header()+body()+footer();
    }
}
