package in.co.nmsworks.training.week2.day4;

public class Runn{
    public static void main(String[] args) {
        SchoolBag sb = new SchoolBag(new Textbook("python"),"jk",12.00);
        System.out.println(sb);
        sb.study();

    }
}
