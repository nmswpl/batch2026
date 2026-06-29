package in.co.nmsworks.training.week2.day6;

public class Runner {
    public static void main(String[] args) {

        libraryBookSystem();
        computeOperations();
    }

    private static void computeOperations() {
        Calculator calculator = new Calculator();
        Adder adder = new Adder();
        System.out.print("Addition of a and b is : ");
        calculator.performCalculation(2,3,adder);
        System.out.print("Multiplication of a and b is : ");
        Multiplier multiplier = new Multiplier();
        calculator.performCalculation(5,2,multiplier);
        System.out.print("Division of a and b is : ");
        Divider divider = new Divider();
        calculator.performCalculation(2,1,divider);
    }

    private static void libraryBookSystem() {
        System.out.println("Library System");
        LibraryBook java = new LibraryBook("Java Programming","Reema Thareja",2020,5);
        LibraryBook python = new LibraryBook("Python Programming","Agarwal",2021,2);
        LibraryBook c = new LibraryBook("C Programming","RK",2000,2);
        LibraryBook ai = new LibraryBook("AI","RR",2010,1);
        LibraryBook ds = new LibraryBook("DS","MM",2022,3);
        java.checkOut();
        python.checkOut();
        c.checkOut();
        ai.checkOut();
        ai.checkOut();
        ds.checkOut();
    }
}
