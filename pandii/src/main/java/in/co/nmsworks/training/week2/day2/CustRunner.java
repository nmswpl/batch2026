package in.co.nmsworks.training.week2.day2;

public class CustRunner {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"pandi");
        Customer c2=new Customer(1,"pandiii");
        if(c1.equals(c2))
        {
            System.out.println("same customer");
        }
        else {
            System.out.println("not same");
        }
    }
}
