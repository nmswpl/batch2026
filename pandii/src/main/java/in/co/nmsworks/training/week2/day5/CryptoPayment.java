package in.co.nmsworks.training.week2.day5;

public class CryptoPayment implements PaymentGateWay{
    @Override
    public void processPayment(double amt) {
        System.out.println("Processing Crypto payment of "+amt);
    }
}
