package in.co.nmsworks.training.week3.day5.Bank;

import java.util.Objects;

public class Bank {
    private double balance;


    public Bank() {
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(balance, bank.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(balance);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}
