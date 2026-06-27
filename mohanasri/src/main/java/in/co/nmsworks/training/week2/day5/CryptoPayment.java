package in.co.nmsworks.training.week2.day5;

public class CryptoPayment implements PaymentGateway{
    @Override
    public String processPayment(double amount) {
        return "Processing crypto payment of "+amount;
    }
}
