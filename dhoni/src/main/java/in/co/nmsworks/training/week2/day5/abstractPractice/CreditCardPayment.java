package in.co.nmsworks.training.week2.day5.abstractPractice;

public class CreditCardPayment implements PaymentGateway {
    private double amount;
    public CreditCardPayment(double amount) {
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
        System.out.println("Processing credit card payment of " + this.getAmount());
        this.setAmount( this.getAmount() - amount);
        System.out.println("Balance : " + this.amount);
    }
}
