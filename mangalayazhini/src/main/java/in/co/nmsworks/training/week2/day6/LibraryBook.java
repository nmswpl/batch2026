package in.co.nmsworks.training.week2.day6;

public class LibraryBook {

    private int id;



    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;

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

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public LibraryBook(int id, String title, String author, int publicationYear, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfCopies = numberOfCopies;
    }

    public void checkout() {
        if (numberOfCopies < 0) {
            System.out.println("Book is not available.");
        } else {
            numberOfCopies--;
            System.out.println(title + " is available.");
        }
    }

    public void displayBook() {
        System.out.println("ID : "+id+"Title : " + title + " Author : " + author + " Publication Year : " + publicationYear + " No of copies : "+ numberOfCopies);

    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
