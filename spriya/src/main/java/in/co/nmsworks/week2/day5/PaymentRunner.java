package in.co.nmsworks.week2.day5;

public class PaymentRunner {
    public static void main(String[] args) {

        PaymentGateway cr=new CryptoPayment();
        makePayment(cr,2000);

        PaymentGateway pp=new PayPalPayment();
        makePayment(pp,2000);

        PaymentGateway cp=new CryptoPayment();
        makePayment(cp,2000);

}


      private static void makePayment(PaymentGateway cr, double amount){
             cr.processPayment(amount);
        }


}
