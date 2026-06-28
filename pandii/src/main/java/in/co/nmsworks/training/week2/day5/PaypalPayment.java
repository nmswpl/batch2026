package in.co.nmsworks.training.week2.day5;

public class PaypalPayment implements PaymentGateWay{

    @Override
    public void processPayment(double amt) {
        System.out.println("Processing PayPal payment of "+amt);
    }
}
