package in.co.nmsworks.training.week2practices;

public class LibraryBook {
    String title;
    String author;
    int publishedYear;
    int noOfCopies;

    public LibraryBook(String title, String author, int publishedYear, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.noOfCopies = noOfCopies;
    }

    void checkOut(){
        if(noOfCopies > 0){
            noOfCopies--;
            System.out.println("Title "+" is availabe");
            System.out.println("Remaining copies "+noOfCopies);
        }
        else{
            System.out.println("The book is unavailable");
        }
    }
    void display() {
        System.out.println("\nTitle : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publication Year : " + publishedYear);
        System.out.println("Copies : " + noOfCopies);
    }


}
