package in.co.nmsworks.training.week2.day2;

public class Runner2 {
    public boolean checkCustomer(Customer c1, Customer c2) {
        return c1.equals(c2);

    }

    public static void main (String[] args) {
        Customer c1 = new Customer(1, "raj");
        Customer c2 = new Customer(1, "raj");
        Runner2 rn = new Runner2();
        System.out.println("res "+rn.checkCustomer(c1, c2));

    }
}