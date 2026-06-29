package in.co.nmsworks.training.week2.day5.task;

public class LibraryBook {

    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopiesAvailable;

    public LibraryBook(int id, String title, String author, int publicationYear, int initialCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopiesAvailable = initialCopies;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNoOfCopiesAvailable() {
        return noOfCopiesAvailable;
    }

    public void setNoOfCopiesAvailable(int noOfCopiesAvailable) {
        this.noOfCopiesAvailable = noOfCopiesAvailable;
    }

    public void checkout() {
        if(noOfCopiesAvailable > 0) {
            noOfCopiesAvailable--;
            System.out.println("Book - " + title + " available.");
            System.out.println("Books remaining count : " + noOfCopiesAvailable);
        }
        else {
            System.out.println("Book - " + title + " not available.");
        }
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", noOfCopiesAvailable=" + noOfCopiesAvailable +
                '}';
    }
}

