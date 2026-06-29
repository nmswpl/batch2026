package in.co.nmsworks.training.week2.day6;

public class LibraryBookRunner {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "Author1", 2016, 50);
        LibraryBook book2 = new LibraryBook("C Programming", "Author2", 2006, 80);
        LibraryBook book3 = new LibraryBook("Computer Networks", "Author3", 2008, 40);
        LibraryBook book4 = new LibraryBook("Operating System", "Author4", 2010, 2);

        book1.displayBook();
        book1.checkout();

        book4.displayBook();
        book4.checkout();
        book4.displayBook();
        book4.checkout();
        book4.displayBook();
        book4.checkout();
    }
}
