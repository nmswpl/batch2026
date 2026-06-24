package in.co.nmsworks.training.week1.exam.set1;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;


    public Book(int id, String title, String author, double price) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
public void display(){
    System.out.println("ID = "+this.id);
    System.out.println("Title = "+this.title);
    System.out.println("Author = "+this.author);
    System.out.println("Price = "+this.price);
    System.out.println("_____________________");
}
}