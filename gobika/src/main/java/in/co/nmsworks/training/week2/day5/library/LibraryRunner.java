package in.co.nmsworks.training.week2.day5.library;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming","James",2026);
        book1.setNoOfCopies(4);
        book1.checkOut();
        book1.checkOut();

        LibraryBook book2 = new LibraryBook("Html", "Tim Berners Lee", 2020);
        book2.setNoOfCopies(1);
        book2.checkOut();
        book2.checkOut();

    }
}
