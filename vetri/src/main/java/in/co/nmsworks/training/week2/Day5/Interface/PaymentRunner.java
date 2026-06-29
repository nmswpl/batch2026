package in.co.nmsworks.training.week2.Day5.Interface;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentGateway paymentGateway;
        CreditCardPayment c1=new CreditCardPayment();
        c1.processPayment(1000);
        makePayment(c1,1000.0);



    }

    public static void makePayment(PaymentGateway paymentGateway, double amount){
        paymentGateway.processPayment(amount);

    }
}
