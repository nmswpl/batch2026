package in.co.nmsworks.training.week2.day5;

public class CreditCardPayment implements PaymentGateway{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of "+amount);

    }
}
