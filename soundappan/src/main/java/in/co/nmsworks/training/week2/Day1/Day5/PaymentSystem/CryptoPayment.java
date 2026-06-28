package in.co.nmsworks.training.week2.Day1.Day5.PaymentSystem;

public class CryptoPayment implements PaymentGateway{

    public void processPayment(double amount) {
        System.out.println("Processinfg crypto Payment "+amount);
    }
}
