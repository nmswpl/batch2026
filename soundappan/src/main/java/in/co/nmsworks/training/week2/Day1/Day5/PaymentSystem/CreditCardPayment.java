package in.co.nmsworks.training.week2.Day1.Day5.PaymentSystem;

public class CreditCardPayment implements PaymentGateway{

    public void processPayment(double amount){
        System.out.println("Processing creid card payment of : "+amount);
    }
}
