package in.co.nmsworks.training.week2.weekend;

public class LibraryBook {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public LibraryBook(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void checkout(){
        if (noOfCopies > 0) {
            noOfCopies--;
            System.out.println("Book available. Copies available after checkout: " + noOfCopies);
        }
        else System.out.println("Book unavailable");
    }
}
