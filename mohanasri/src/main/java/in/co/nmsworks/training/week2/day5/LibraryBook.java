package in.co.nmsworks.training.week2.day5;

public class LibraryBook {
    String title;
    String author;
    int publicationYear;
    int noOfCopies;

    void checkout(){
        if (this.noOfCopies > 0){
            noOfCopies--;
            System.out.println(this.title + " Successfully fetched ");
        }
        else {
            System.out.println("failed to fetch "+ this.title);
        }

    }

    public LibraryBook(String title, String author, int publicationYear, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
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
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", noOfCopies=" + noOfCopies +
                '}';
    }
}
