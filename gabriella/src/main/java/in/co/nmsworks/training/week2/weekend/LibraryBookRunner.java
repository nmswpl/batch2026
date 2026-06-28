package in.co.nmsworks.training.week2.weekend;

public class LibraryBookRunner {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "Author name", 2006);
        book.setNoOfCopies(2);
        book.checkout();
        book.checkout();
        book.checkout();
    }


}
