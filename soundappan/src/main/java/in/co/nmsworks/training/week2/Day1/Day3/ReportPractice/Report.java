package in.co.nmsworks.training.week2.Day1.Day3.ReportPractice;

public abstract class Report {
    abstract void header();
    abstract void body();
    abstract void footer();

    public void generate(){
        header();
        body();
        footer();
    }
}