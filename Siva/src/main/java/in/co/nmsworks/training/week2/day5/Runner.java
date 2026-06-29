package in.co.nmsworks.training.week2.day5;

public class Runner {
    public static void main(String[] args) {
//        manageBankAccountAndPrintInterest();
        managePaymentGateway();
    }

    private static void managePaymentGateway() {
        PayPalPayment pp = new PayPalPayment();
        CreditCardPayment cc =  new CreditCardPayment();
        CryptoPayment cp = new CryptoPayment();
        makePayment(pp,50000.0);
        makePayment(cc,60000.0);
        makePayment(cp,70000.0);
    }

    public static void makePayment(PaymentGateway paymentGateway, double amt) {
        paymentGateway.processPayment(amt);
    }

    private static void manageBankAccountAndPrintInterest() {
        SBI sbi = new SBI();
        TMB tmb = new TMB();
        IOB iob = new IOB();
        System.out.println("Interest of SBI : "+sbi.calculateYearlyInterest(10000.0));
        System.out.println("Interest of TMB : "+tmb.calculateYearlyInterest(10000.0));
        System.out.println("Interest of IOB : "+iob.calculateYearlyInterest(10000.0));
    }
}
