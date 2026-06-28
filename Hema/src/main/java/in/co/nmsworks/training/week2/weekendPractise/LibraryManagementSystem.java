package in.co.nmsworks.training.week2.weekendPractise;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryBook harryPotter = new LibraryBook("Harry Potter", "J K Rowi;ng", 1990, 8);
        LibraryBook aliceInWonderLand = new LibraryBook("Alice in WonderLand","Hema", 1999,2);
        LibraryBook aOT = new LibraryBook("Attack On Titan", "Hajime Isaiyama", 2009, 1);

        aliceInWonderLand.checkout();
        aliceInWonderLand.checkout();
        aliceInWonderLand.checkout();
        aOT.checkout();
        aOT.checkout();

    }
}
