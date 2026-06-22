package in.co.nmsworks.training.week1.exam;

public class Book {
     private int id;
     private String title;
     private String author;
     private float price;

    public Book(int id, String title, String author, float price)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return this.price;
    }

    public  void setPrice(float price) {
        this.price = price;
    }

    public void display() {
        System.out.println("ID = "+this.id);
        System.out.println("Title = "+this.title);
        System.out.println("Author = "+this.author);
        System.out.println("Price = "+this.price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book(1,"The voyage","Hema", 150);
        Book b2 = new Book(2,"The skyscrappers","Thanu", 250);
        Book b3 = new Book(3,"Harry Potter","J K Rowling", 1550);
        Book b4 = new Book(4,"AOT","Eren Yeager", 2550);
        Book b5 = new Book(5,"Java Programming","James Goshling", 450);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();

    }


}
