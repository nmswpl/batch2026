package in.co.nmsworks.training.week1.exam.set1;

import static in.co.nmsworks.training.week1.exam.set1.BookStore.printBookDetails;

public class Runner {

    public static void main(String[] args) {

        BookStore book1 = new BookStore(101, "Java Programming", "James Gosling", 450.0f);
        BookStore book2 = new BookStore(102, "Python Programming", "Russel", 400.0f);
        BookStore book3 = new BookStore(103, "Basics of Programming", "Sinthanai Fort", 300.0f);
        BookStore book4 = new BookStore(104, "Programming C", "REmma Therija", 200.0f);
        BookStore book5 = new BookStore(105, "Computations and Theorems", "Hendry Evens", 600.0f);

        printBookDetails(book1);
        printBookDetails(book2);
        printBookDetails(book3);
        printBookDetails(book4);
        printBookDetails(book5);
    }
}