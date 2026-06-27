package in.co.nmsworks.training.week2.day5.library;

public class LibraryBook {
    private String title;
    private String author;
    private long publicationYear;
    private int noOfCopies;

    public LibraryBook(String title, String author, long publicationYear) {
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

    public long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(long publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void checkOut(){
        if (noOfCopies > 0){
            noOfCopies -= 1;
            System.out.println("Book Available");
        }
        else {
            System.out.println("Book Unavailable");
        }
    }
}
