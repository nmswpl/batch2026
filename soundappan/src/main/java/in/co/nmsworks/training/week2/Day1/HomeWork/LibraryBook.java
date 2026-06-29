package in.co.nmsworks.training.week2.Day1.HomeWork;

public class LibraryBook {
    public LibraryBook(String title, String author, String year, int number_of_copies) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.number_of_copies = number_of_copies;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNumber_of_copies() {
        return number_of_copies;
    }

    public void setNumber_of_copies(int number_of_copies) {
        this.number_of_copies = number_of_copies;
    }

    private String title;
    private String author;
    private String year;
    private int number_of_copies;

    public void displayBook(){
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Year : "+this.year);
        System.out.println("Number Of Copies : "+this.number_of_copies);
    }

    public void checkout() {
        if (number_of_copies > 0) {
            number_of_copies--;
            System.out.println("Book Title : "+this.title);
            System.out.println("Number Of copies Available : " + number_of_copies);
        } else {
            System.out.println("Book Title : "+this.title);
            System.out.println("Copies not Available");
        }
    }
}
