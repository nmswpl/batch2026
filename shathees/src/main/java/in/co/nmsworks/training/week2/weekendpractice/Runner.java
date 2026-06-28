package in.co.nmsworks.training.week2.weekendpractice;

public class Runner {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java","james gosling",2019,1);
        System.out.print(lb);
        lb.checkout();
        lb.checkout();


    }
}
