package in.co.nmsworks.training.week2.day5;

public class CryptoPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto payment of amount : Rs " + amount);
    }
}
