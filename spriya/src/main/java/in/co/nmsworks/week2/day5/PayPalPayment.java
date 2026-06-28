package in.co.nmsworks.week2.day5;

public class PayPalPayment implements PaymentGateway {

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
