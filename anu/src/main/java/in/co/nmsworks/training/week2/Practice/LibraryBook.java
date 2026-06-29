package in.co.nmsworks.training.week2.Practice;

public class LibraryBook {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopy;

    public LibraryBook(String title, String author, int publicationYear, int noOfCopy) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopy = noOfCopy;
    }

    public void checkOut(){
        if(this.noOfCopy > 0 ){
            this.noOfCopy--;
            System.out.println(this.title + " " + " available");
        }
        else{
            System.out.println(this.title + " " + " book unavailable.");
        }
    }
}
