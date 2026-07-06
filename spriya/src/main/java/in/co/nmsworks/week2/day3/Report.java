package in.co.nmsworks.week2.day3;

public class Report {

    public void generte() {
        header();
        body();
        footer();
    }

    public void header() {
        System.out.println("Header");
    }

    public void body() {
        System.out.println("General Report Body");
    }


    public void footer() {
        System.out.println("Footer");
    }
}