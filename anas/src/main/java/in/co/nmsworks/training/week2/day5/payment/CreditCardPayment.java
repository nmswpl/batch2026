package in.co.nmsworks.training.week2.day5.payment;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CreditCard payment of " + amount);
    }
}
