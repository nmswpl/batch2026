package in.co.nmsworks.training.week2.day3;

public class Report {
    public String header(){
        return "";
    }

    public String body(){

        return "";
    }

    public String footer(){
       return "";

    }

    public void generate(){
        System.out.println(
                "_____________________________________\n"+
                header()+
                "\n_____________________________________\n"+

                body() +
                "\n_____________________________________\n"+
                footer()+
                "\n_____________________________________");

    }
}
