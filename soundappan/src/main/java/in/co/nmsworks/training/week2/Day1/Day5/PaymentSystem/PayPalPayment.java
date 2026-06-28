package in.co.nmsworks.training.week2.Day1.Day5.PaymentSystem;

public class PayPalPayment implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing PayPalPayment card payment of : "+amount);
    }
}
