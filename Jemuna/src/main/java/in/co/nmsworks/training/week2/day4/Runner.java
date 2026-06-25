package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {
        Textbook textbook = new Textbook("Java Programming");
        SchoolBag sb=new SchoolBag("WildCraft",130,textbook);
        System.out.println(sb);
        sb.open();
        sb.study();



    }
}
