package in.co.nmsworks.training.week1.exam;

public class BookOwners {

    private int id;
    private String author;
    private String title;
    private int price;

    public int getID() {
        return id;
    }

    public void setID(int newid) {
        this.id = newid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
}