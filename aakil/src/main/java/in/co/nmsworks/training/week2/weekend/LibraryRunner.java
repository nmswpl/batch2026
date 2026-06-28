package in.co.nmsworks.training.week2.weekend;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryBook rdpd = new LibraryBook("Rich Dad Poor Dad", "Robert Kiyosaki", 2026,2);
        rdpd.checkOut();
        rdpd.checkOut();
        rdpd.checkOut();
    }
}
