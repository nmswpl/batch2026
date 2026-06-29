package in.co.nmsworks.training.week2.Day5.Interface;

public class CryptoPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {

        System.out.println("Processing credit card payment of " + amount);
    }



}
