package in.co.nmsworks.training.week2.day5;

public class CreditCardPayment implements PaymentGateWay{

    @Override
    public void processPayment(double amt) {
        System.out.println("Processing credit card payment of "+amt);
    }
}
