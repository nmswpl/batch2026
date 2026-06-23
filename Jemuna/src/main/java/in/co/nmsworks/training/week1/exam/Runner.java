package in.co.nmsworks.training.week1.exam;

public class Runner {

    public static void main(String[] args) {
        Book bk1=new Book(1, "Java Programming","James Gosling",450.0);
        bk1.printBookDetails();

        MobilePhone mp1=new MobilePhone(201,"Samsung","Galaxy S24",79999.0);
        mp1.printMobileDetails();


    }
}
