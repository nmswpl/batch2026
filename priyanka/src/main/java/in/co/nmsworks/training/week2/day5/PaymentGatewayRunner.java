package in.co.nmsworks.training.week2.day5;

public class PaymentGatewayRunner {
    public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment();
        makePayment( credit,1000);

        PayPalPayment paypal = new PayPalPayment();
        makePayment(paypal,2000);

        CryptoPayment crypto = new CryptoPayment();
        makePayment(crypto,3000);
    }

    public static void makePayment(PaymentGateway paymentGateway, double amount){
        paymentGateway.processPayment(amount);
    }
}
