package in.co.nmsworks.training.week1.exam;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James Gosling", 450);
        Book b2 = new Book(102, "HTML", "Tim Berners Lee", 489);
        Book b3 = new Book(103, "Java", "James ", 458);
        Book b4 = new Book(104, "Java Programming", "James Gosling", 450);
        Book b5 = new Book(105, "Java Programming", "James Gosling", 450);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();

    }
}
