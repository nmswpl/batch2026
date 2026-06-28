package in.co.nmsworks.training.week2.day5;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Processing credit card payment of amount " + amount;
    }
}
