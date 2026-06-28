package in.co.nmsworks.training.week2.weekendPractise;

public class LibraryBook {
    String title;
    String author;
    int publicationYear;
    int noOfCopies;

    public LibraryBook(String title, String author, int publicationYear, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    void checkout(){
        if(this.noOfCopies > 0 ) {
            System.out.println("Available");
            this.noOfCopies--;
        }
        else
        {
            System.out.println("Not available");
        }


    }
}
