package in.co.nmsworks.training.week2.day5;

public class BankRunner{
    public static void main(String[] args) {
//        bankMethod();
//        paymentMethod();

    }


    private static void paymentMethod() {
        CreditCardPayment cc = new CreditCardPayment();
        CryptoPayment cr = new CryptoPayment();
        PayPalPayment pp = new PayPalPayment();
        makePayment(cc);
        makePayment(cr);
        makePayment(pp);
    }

    private static void makePayment(PaymentGateway pg) {
        pg.processPayment(5000);
    }

    private static void bankMethod() {
        Tmb tobj = new Tmb();
        Kvb kobj = new Kvb();
        Sbi sobj = new Sbi();
        System.out.println("The Interest for TMB :: " + tobj.calculateYearlyInterest(2000));
        System.out.println("The Interest for KVB :: " + kobj.calculateYearlyInterest(3000));
        System.out.println("The Interest for SBI :: " + sobj.calculateYearlyInterest(500));
    }
}
