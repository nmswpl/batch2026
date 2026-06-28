package in.co.nmsworks.training.week2.weekend;

public class LibraryBook {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public LibraryBook(String title, String author, int publicationYear, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
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

    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publicationYear=" + getPublicationYear() +
                ", noOfCopies=" + getNoOfCopies() +
                '}';
    }

    public void checkOut(){
        if (getNoOfCopies() != 0){
            System.out.println(this + " is available for checkout.");
            setNoOfCopies(getNoOfCopies() - 1);
            return;
        }
        System.out.println(this + " is not available for checkout.");
    }
}
