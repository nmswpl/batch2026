package in.co.nmsworks.training.week2.day5.paymentsystem;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card payment of "+ amount);
    }
}
