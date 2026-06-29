package in.co.nmsworks.training.week2.exercise;

public class LibraryBookRunner {
    public static void main(String[] args) {

        String[] title = {"Java Program","Python","Jungle book"};
        String[] author = {"Robins","Guido","Shakespere"};
        int[] publicationYear = {2012,2005,2025};
        int[] noOfCopies = {1,3,4};
        LibraryBook[] books = new LibraryBook[title.length];
        for (int i = 0; i < title.length; i++) {
            books[i] = new LibraryBook(title[i], author[i],publicationYear[i],noOfCopies[i] );
        }
        for (LibraryBook libBook : books) {

            System.out.println(libBook);
            libBook.checkOut();
            System.out.println();
        }

    }
}
