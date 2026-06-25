package in.co.nmsworks.training.week2.day4;

public class SchoolBagRunner {
    public static void main(String[] args) {
        SchoolBag bag = new SchoolBag(20, "Wildcraft");
        bag.setTextbook(new Textbook("Java Programming"));

        System.out.println("MAX WEIGHT = " + bag.getMaxWeight());
        bag.open();
        bag.study();
    }
}
