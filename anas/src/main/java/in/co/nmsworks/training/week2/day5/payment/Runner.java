package in.co.nmsworks.training.week2.day5.payment;

public class Runner {
    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment();
        makePayment(creditCard, 10000);

        PaypalPayment payPal = new PaypalPayment();
        makePayment(payPal, 10000);

        CryptoPayment crypto = new CryptoPayment();
        makePayment(crypto, 10000);



    }
    public static void makePayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.processPayment(amount);
    }
}
