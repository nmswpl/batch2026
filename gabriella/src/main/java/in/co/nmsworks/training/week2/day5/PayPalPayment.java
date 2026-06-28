package in.co.nmsworks.training.week2.day5;

public class PayPalPayment implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Processing paypal payment of amount " + amount;
    }
}
