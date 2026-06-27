package in.co.nmsworks.training.week2.day5;

public class PaymentRunner {
    public static void main(String[] args) {

        makePayment(new CreditCardPayment(), 50000);
        makePayment(new CreditCardPayment(), 60000);
        makePayment(new CreditCardPayment(), 70000);
    }

    public static void makePayment(PaymentGateway paymentGateway, double amount)
    {
        paymentGateway.processPayment(amount);
    }
}
