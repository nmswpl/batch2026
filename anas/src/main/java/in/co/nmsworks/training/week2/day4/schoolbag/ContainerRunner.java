package in.co.nmsworks.training.week2.day4.schoolbag;

public class ContainerRunner {
    public static void main(String[] args) {
        SchoolBag s1 = new SchoolBag();
        s1.setMaxWeight(20);
        s1.getMaxWeight();
        s1.open();
        s1.setBrandName("skybags");
        s1.setT1(new Textbook("reading code"));
        s1.study();

    }
}
