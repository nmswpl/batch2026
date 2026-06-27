package in.co.nmsworks.training.week1.day2;

public class Book {

    private String title;
    private String author;
    private double price;
    private int bookId;
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ID = " + bookId);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "James Gosling", 450.0);
        Book book2 = new Book(102, "Effective Java", "Joshua Bloch", 550.0);
        Book book3 = new Book(103, "Clean Code", "Robert C. Martin", 600.0);
        Book book4 = new Book(104, "Introduction to Algorithms", "Thomas H. Cormen", 850.0);
        Book book5 = new Book(105, "Head First Design Patterns", "Eric Freeman", 700.0);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
    }


}



