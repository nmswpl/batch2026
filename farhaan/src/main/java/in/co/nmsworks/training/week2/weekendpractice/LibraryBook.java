package in.co.nmsworks.training.week2.weekendpractice;

public class LibraryBook {
    public String title;
    public String author;
    public int publicationYear;
    public int noOfCopies;

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

    @Override
    public String toString() {
        return "The Book " + title;
    }

    public void checkout(){
        if(this.noOfCopies > 0){
            System.out.println(this + " is available");
            setNoOfCopies(getNoOfCopies()-1);
        }
        else {
            System.out.println(this + " is not available");
        }
    }
}
