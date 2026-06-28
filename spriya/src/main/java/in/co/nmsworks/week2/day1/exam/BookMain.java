package in.co.nmsworks.week2.day1.exam;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setId(101);
        b1.setTitle("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(450.0);

        Book b2 = new Book();
        b2.setId(102);
        b2.setTitle("Computer");
        b2.setAuthor("Charles Babbage");
        b2.setPrice(550.0);

        Book b3 = new Book();
        b3.setId(103);
        b3.setTitle("The Silent Patient");
        b3.setAuthor("Alicia Berenson");
        b3.setPrice(600.0);

        Book b4 = new Book();
        b4.setId(104);
        b4.setTitle("Ikigai");
        b4.setAuthor("Japanese author");
        b4.setPrice(900.0);

        Book b5 = new Book();
        b5.setId(105);
        b5.setTitle("America");
        b5.setAuthor("Avengers");
        b5.setPrice(950.0);

        System.out.println(b1.getID());
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());

    }
}
