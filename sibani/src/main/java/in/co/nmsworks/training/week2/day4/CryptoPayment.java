package in.co.nmsworks.training.week2.day4;

public class CryptoPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment of : " + amount);
    }
}
