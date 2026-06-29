package in.co.nmsworks.training.week2.day5;

public class PaypalPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of amount : Rs " + amount);
    }
}
