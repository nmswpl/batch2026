package in.co.nmsworks.training.week1.exam;

public class Book {
    /**Create five Book (Book ID, Title, Author, Price) objects by providing the required details. Display attributes of each book in the following format:

     ID = 101
     Title = Java Programming
     Author = James Gosling
     Price = 450.0**/

    private int bookID;
    private String title;
    private String author;
    private Double price;

    public Book(){

    }

    public Book(int bookID, String title, String author, Double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void printBookDetails( ){

        System.out.println("Printing the Details of the Book");
        System.out.println("ID = "+getBookID());
        System.out.println("Title ="+getTitle());
        System.out.println("Author = "+getAuthor());
        System.out.println("Price ="+getPrice());

    }
}
