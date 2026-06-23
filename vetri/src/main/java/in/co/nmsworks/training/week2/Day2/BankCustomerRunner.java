package in.co.nmsworks.training.week2.Day2;

public class BankCustomerRunner {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer(1, "Vetri");
        BankCustomer customer2 = new BankCustomer(1, "Selvan");
        BankCustomer customer3 = new BankCustomer(2, "Selvan");

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));

    }
}
