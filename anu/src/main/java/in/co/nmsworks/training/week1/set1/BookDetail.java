package in.co.nmsworks.training.week1.set1;

public class BookDetail {
    private int Id;
    private String title;
    private String Author;
    private double price;

    public BookDetail(){
    }

    public BookDetail(int id, String title, String author, double price) {
        Id = id;
        this.title = title;
        Author = author;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

