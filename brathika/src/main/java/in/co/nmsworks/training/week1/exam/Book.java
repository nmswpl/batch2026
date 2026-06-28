package in.co.nmsworks.training.week1.exam;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(int book_id, String title, String author, double price) {
        this.bookId = book_id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printValues(){
        System.out.println("Book Id: "+this.getBookId());
        System.out.println("Title: "+this.getTitle());
        System.out.println("Author: "+this.getAuthor());
        System.out.println("Price: "+this.getPrice());
    }
}
