package in.co.nmsworks.training.week2.day5;

public class PaymentRunner {
    public static void main(String[] args) {

        PaymentRunner runner = new PaymentRunner();

        CryptoPayment ccp = new CryptoPayment();
        runner.makePayment(ccp,5000.0);

        PayPalPayment ppp = new PayPalPayment();
        runner.makePayment(ppp,5000.0);


    }

    public void makePayment(PaymentGateway pg, double amount ){
        pg.processPayment(amount);
    }
}
