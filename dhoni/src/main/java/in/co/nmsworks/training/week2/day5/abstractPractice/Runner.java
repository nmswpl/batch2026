package in.co.nmsworks.training.week2.day5.abstractPractice;

public class Runner {
    public static void main(String[] args) {
        //bankMethods();
        //paymentMethods();
    }

    private static void paymentMethods() {
        CreditCardPayment creditCardPayment = new CreditCardPayment(1000);
        makePayment(creditCardPayment,100);

        PayPalPayment payPalPayment = new PayPalPayment(2000);
        makePayment(payPalPayment,100);

        CryptoPayment cryptoPayment = new CryptoPayment(5000);
        makePayment(cryptoPayment,500);
    }

    private static void makePayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.processPayment(amount);
    }

    private static void bankMethods() {
        SBI sbi = new SBI(7.2F);
        sbi.setPrinciple(10000);

        System.out.println("SBI principle : " + Math.round(sbi.getPrinciple())
                + " rate : " + Math.round(sbi.getRateOfInterest())
                + " Amount :" +Math.round(sbi.calculateYearlyInterest())
        );

        IOB iob = new IOB(7.1F);
        iob.setPrinciple(10000);

        System.out.println("SBI principle : " + Math.round(iob.getPrinciple())
                + " rate : " + Math.round(iob.getRateOfInterest())
                + " Amount :" +Math.round(iob.calculateYearlyInterest())
        );

        KBC kbc = new KBC(7.5F);
        kbc.setPrinciple(10000);

        System.out.println("SBI principle : " + Math.round(kbc.getPrinciple())
                + " rate : " + Math.round(kbc.getRateOfInterest())
                + " Amount :" +Math.round(kbc.calculateYearlyInterest())
        );
    }
}
