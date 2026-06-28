package in.co.nmsworks.training.week2.weekendpractice;

public class LibraryBook {
    String title;
    String author;
    int publicationYear;
    int noOfCopies;

    public LibraryBook(String title, String author, int publicationYear,int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    public void checkout(){
        if (noOfCopies > 0){
            System.out.println("The book is available");
            noOfCopies --;
        } else if (noOfCopies == 0) {
            System.out.println("The book is not available");
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
