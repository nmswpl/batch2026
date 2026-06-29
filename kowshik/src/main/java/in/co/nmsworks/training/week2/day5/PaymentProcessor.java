package in.co.nmsworks.training.week2.day5;

public class PaymentProcessor {

    public static void makePayment(PaymentGateway paymentGateway, double amount){
        paymentGateway.processPayment(amount);
    }
}
