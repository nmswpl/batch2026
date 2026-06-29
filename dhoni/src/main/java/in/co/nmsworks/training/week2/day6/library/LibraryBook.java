package in.co.nmsworks.training.week2.day6.library;

public class LibraryBook {
    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;

    public LibraryBook(String title, String author, int publicationYear, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfCopies = numberOfCopies;
    }

    public void displayBook(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("Available Copies : " + numberOfCopies);
    }

    public void checkOut(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println(title + " is available");
            System.out.println("Remaining copies : " + numberOfCopies);
        }
        else {
            System.out.println(title + " is unavailable");
        }
    }
}
