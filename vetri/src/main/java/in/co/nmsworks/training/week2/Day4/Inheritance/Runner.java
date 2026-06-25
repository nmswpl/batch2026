package in.co.nmsworks.training.week2.Day4.Inheritance;

public class Runner {
    public static void main(String[] args) {

        //Textbook t1 = new Textbook();
        //t1.setSubject("Java Programming");

        SchoolBag vetrisBag = new SchoolBag("Wildcraft","java");
        vetrisBag.setMaxWeight(20.0);
        System.out.println("Bag Max Weight: " + vetrisBag.getMaxWeight() + " kg");
        vetrisBag.open();

        System.out.println("Studying from the bag...");
        vetrisBag.study();


    }
}
