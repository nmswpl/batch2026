package in.co.nmsworks.training.week1.exam.set1;

public class BookStore {

    private int id;
    private String title;
    private String author;
    private float price;

    public BookStore() {
    }

    public BookStore(int id, String title, String author, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void printBookDetails(BookStore book) {
        System.out.println(
                "ID : " + book.getId() +
                        ", Title : " + book.getTitle() +
                        ", Author : " + book.getAuthor() +
                        ", Price : " + book.getPrice()
        );
    }
}