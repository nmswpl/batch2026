package in.co.nmsworks.training.week2.day5;

public class BankRunner {
    public static void main(String[] args) {
        BankOne bank1 = new BankOne();
        System.out.println(bank1.calculateYearlyInterest(70000));

        BankTwo bank2 = new BankTwo();
        System.out.println(bank2.calculateYearlyInterest(80000));

        BankThree bank3 = new BankThree();
        System.out.println(bank3.calculateYearlyInterest(95000));
        System.out.println(" ");

        CreditCardPayment cp = new CreditCardPayment();
        makePayment(cp, 70000);

        PayPalPayment pp = new PayPalPayment();
        makePayment(pp, 500);

        CryptoPayment crp = new CryptoPayment();
        makePayment(crp, 250);

    }

    private static void makePayment(PaymentGateway pg, double amount){
        System.out.println(pg.processPayment(amount));
    }
}
