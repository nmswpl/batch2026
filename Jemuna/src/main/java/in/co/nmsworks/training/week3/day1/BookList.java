package in.co.nmsworks.training.week3.day1;

public class BookList {
    private int bookID;
    private String title;
    private String author;
    private Double price;

    public BookList(){

    }

    public BookList(int bookID, String title, String author, Double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
