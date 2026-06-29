package in.co.nmsworks.training.week2.Day1.HomeWork;

public class Runner {
    public static void main(String[] args) {
//        LibraryBook book1=new LibraryBook("Atomic Habits","James Clear","2012",5);
//        LibraryBook book2=new LibraryBook("Ponniyin Selvan","Kalki Krishnamurthy","2020",2);
//        System.out.println("-------------------Library---------------------");
//        book1.displayBook();
//        System.out.println("____________________________________");
//        book2.displayBook();
//        System.out.println("____________________________________");
//        book1.checkout();
//        System.out.println("____________________________________");
        Calculator cal=new Calculator();
        Computable add=new Adder();
        Computable multiply=new Multiplier();
        Computable divide=new Divider();
        cal.performCalculation(10,5,add);
        cal.performCalculation(15,16,multiply);
        cal.performCalculation(10,2,divide);

    }
}
