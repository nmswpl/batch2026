package in.co.nmsworks.week2.day5;

public class CryptoPayment implements PaymentGateway{

    public void processPayment(double amount){
        System.out.println("Processing crypto payment of "+ amount );

    }
}
