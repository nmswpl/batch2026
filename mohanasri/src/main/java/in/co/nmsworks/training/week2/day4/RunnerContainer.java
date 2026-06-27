package in.co.nmsworks.training.week2.day4;

public class RunnerContainer {
    public static void main(String[] args) {


        SchoolBag sb = new SchoolBag("Star", new Textbook ("Java"));
        sb.open();
        sb.study();
        sb.setBrandName("STAR");
        System.out.println(sb);

    }
}
