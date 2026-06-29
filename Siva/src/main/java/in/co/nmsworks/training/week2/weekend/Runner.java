package in.co.nmsworks.training.week2.weekend;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        manageLibraryBooks();
    }

    private static void manageLibraryBooks() {
        LibraryBook book1 = new LibraryBook("Java","John","2007",10);
        book1.checkout(12);
        System.out.println(book1);
        book1.checkout(7);
        System.out.println(book1);
    }
}
