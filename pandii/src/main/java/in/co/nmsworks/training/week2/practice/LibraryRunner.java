package in.co.nmsworks.training.week2.practice;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryBook book=new LibraryBook("Java","Sundaresan",2005,2);
        System.out.println(book);
        book.checkout();
        book.checkout();
        System.out.println(book);
        LibraryBook book1=new LibraryBook("Python","King",2008,3);
        System.out.println(book1);
        book1.checkout();
        book1.checkout();
        book1.checkout();
        System.out.println(book1);
    }
}
