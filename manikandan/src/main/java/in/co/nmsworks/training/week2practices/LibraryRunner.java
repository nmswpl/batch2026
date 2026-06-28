package in.co.nmsworks.training.week2practices;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 2020, 2);
        LibraryBook book2 = new LibraryBook("Data Structures", "Mark Allen", 2018, 1);
        LibraryBook book3 = new LibraryBook("Python Basics", "Guido van Rossum", 2022, 0);

        book1.display();
        book1.checkOut();
        book1.checkOut();
        book1.checkOut();

        book2.display();
        book2.checkOut();

        book3.display();
        book3.checkOut();

        Calculator calc = new Calculator();

        System.out.println("\nCalculator Operations:");
        calc.performCalculation(10, 5, new Adder());
        calc.performCalculation(10, 5, new Multiplier());
        calc.performCalculation(10, 5, new Divider());
        calc.performCalculation(10, 0, new Divider());
    }
}
