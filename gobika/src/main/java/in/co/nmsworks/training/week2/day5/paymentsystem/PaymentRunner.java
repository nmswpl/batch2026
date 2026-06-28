package in.co.nmsworks.training.week2.day5.paymentsystem;

public class PaymentRunner {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();

        CryptoPayment cryptoPayment = new CryptoPayment();

        PayPalPayment payPalPayment = new PayPalPayment();

        makePayment(creditCardPayment,70000);
        makePayment(cryptoPayment,30000);
        makePayment(payPalPayment,10000);

    }

    private static void makePayment(PaymentGateway paymentGateway,double amount) {
        paymentGateway.processPayment(amount);
    }
}
