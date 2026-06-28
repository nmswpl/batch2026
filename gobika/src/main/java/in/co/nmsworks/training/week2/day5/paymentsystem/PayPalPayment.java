package in.co.nmsworks.training.week2.day5.paymentsystem;

public class PayPalPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of "+ amount);
    }
}
