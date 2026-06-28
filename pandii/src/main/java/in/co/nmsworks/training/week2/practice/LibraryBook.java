package in.co.nmsworks.training.week2.practice;

public class LibraryBook {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

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

    public LibraryBook(String title, String author, int publicationYear, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    void checkout()
    {
        if(noOfCopies>0)
        {
            noOfCopies--;
            System.out.println(title+" Check out successfully ");
            System.out.println("Available copies of "+title+" "+noOfCopies);
        }
        else {
            System.out.println(title + " is unavailable");
        }
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", noOfCopies=" + noOfCopies +
                '}';
    }
}
