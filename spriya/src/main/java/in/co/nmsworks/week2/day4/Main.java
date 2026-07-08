package in.co.nmsworks.week2.day4;

public class Main {

    public static void main(String[] args) {

        Container container = new Container();
        TextBook textBook = new TextBook();
        SchoolBag schoolBag = new SchoolBag();

        textBook.setSubject("Java Programming");
        container.setMaxWeight(10);

        schoolBag.setTextBook(textBook);

        System.out.println("The book name is: " + textBook.getSubject());
        System.out.println("The max weight is: " + container.getMaxWeight());

        container.open();
        schoolBag.study();
    }
}