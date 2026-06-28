package in.co.nmsworks.training.week2.Day1.Day5.PaymentSystem;

public class Runner {
    public static void main(String[] args) {
        PaymentGateway c1 = new CryptoPayment();
        makePayment(c1,1000);
        PaymentGateway c2= new CreditCardPayment();
        makePayment(c2,1000);
        PaymentGateway c3=new PayPalPayment();
        makePayment(c3,1500);
    }
    private static void makePayment(PaymentGateway paymentGateway,double amount) {
        paymentGateway.processPayment(amount);
    }
}

