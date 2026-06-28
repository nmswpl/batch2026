package in.co.nmsworks.week2.day5;

public class CreditCardPayment implements PaymentGateway{


    public void processPayment(double amount){
        System.out.println("Processing credit card payment of "+ amount );

    }


}
