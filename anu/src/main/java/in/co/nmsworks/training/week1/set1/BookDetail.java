package in.co.nmsworks.training.week1.set1;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "BookDetail{" +
                "Id=" + Id +
                ", title='" + title +
                ", Author='" + Author +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookDetail that = (BookDetail) o;
        return Id == that.Id && Double.compare(price, that.price) == 0 && Objects.equals(title, that.title) && Objects.equals(Author, that.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, title, Author, price);
    }
}

