package in.co.nmsworks.training.week2.day5;

public class RunnerPaymentGateway {
    public static void main(String[] args) {

        CreditCardPayment ccp = new CreditCardPayment();
        makePayment(ccp, 20000);

        PayPalPayment ppp = new PayPalPayment();
        makePayment(ppp, 3000);

        CryptoPayment cp = new CryptoPayment();
        makePayment(cp,10000);

    }

    static void makePayment(PaymentGateway pg, double amount) {
        System.out.println(pg.processPayment(amount));

    }
}
