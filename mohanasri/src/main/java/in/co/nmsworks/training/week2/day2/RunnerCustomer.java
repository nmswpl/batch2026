package in.co.nmsworks.training.week2.day2;

public class RunnerCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C1001", "Moh");
        Customer customer2 = new Customer("C1001", "Faah");
        Customer customer3 = new Customer("C1002", "Bob");

        System.out.println("Are customer1 and customer2 the same? " + customer1.equals(customer2));
        System.out.println("Are customer1 and customer3 the same? " + customer1.equals(customer3));
    }
}
