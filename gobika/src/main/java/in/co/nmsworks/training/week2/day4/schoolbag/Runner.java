package in.co.nmsworks.training.week2.day4.schoolbag;

public class Runner {
    public static void main(String[] args) {
        SchoolBag schoolBag = new SchoolBag(45,"wildcart", new TextBook("Java"));
        System.out.println("Maximum weight of a bag : "+ schoolBag.getMaxWeight());
        schoolBag.open();
        schoolBag.study();
    }
}
