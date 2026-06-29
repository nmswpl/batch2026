package in.co.nmsworks.training.week2.day6.library;

public class Runner {
    public static void main(String[] args) {
        libraryMethods();

    }

    private static void libraryMethods() {
        LibraryBook book1 = new LibraryBook("Java Programming", "James", 2020, 2);
        LibraryBook book2 = new LibraryBook("C Programming","Denis" ,2010,2);

        book1.displayBook();
        book1.checkOut();
        book1.checkOut();
        book1.checkOut();

        System.out.println();
        book2.displayBook();
        book2.checkOut();
    }
}
