package in.co.nmsworks.training.week2.weekendpractice;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryBook harryPotter = new LibraryBook("Harry Potter", "J K Rowling", 2022, 1);
        harryPotter.checkout();
        harryPotter.checkout();
    }
}
