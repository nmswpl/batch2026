package in.co.nmsworks.week2.day4;

public class Main {
    public static void main(String[] args) {
        Container c=new Container();
        TextBook b=new TextBook();
        SchoolBag sb=new SchoolBag();

        System.out.println("the book name is "+(b.subject="Java Programming"));
        System.out.println("the maxWeight is :"+(c.maxWeight=10));
        c.open();
        sb.study();
    }
}
