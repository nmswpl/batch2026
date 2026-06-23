package in.co.nmsworks.training.week1.exam;

public class RunnerForBook {
    public static void main(String[] args) {
        Book b1 = new Book(1,"Java Programming","Ros gogler",500);
        b1.displayDetails();
        Book b2 = new Book(2,"C Programming","Robbin",600);
        b2.displayDetails();
        Book b3 = new Book(3,"Python Programming","Van de Rossum",700);
        b3.displayDetails();
        Book b4 = new Book(4,"3 am Blues","Neha",800);
        b4.displayDetails();
        Book b5 = new Book(5,"Ponniyin Selvan","Kalki",900);
        b5.displayDetails();
    }
}
