package in.co.nmsworks.training.week2.day5.abstractPractice;

public class CryptoPayment implements PaymentGateway{
    private double amount;
    public CryptoPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto payment of " + this.getAmount());
        this.setAmount( this.getAmount() - amount);
        System.out.println("Balance : " + this.amount);
    }
}
