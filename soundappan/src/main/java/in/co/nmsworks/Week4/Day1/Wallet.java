package in.co.nmsworks.Week4.Day1;

import java.util.Objects;

public class Wallet implements Account {

    private int balance;
    private int transactionLimit;

    public Wallet(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(int transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Transaction limit reached");
        } else {
            balance += amount;
        }
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Transaction limit reached");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", transactionLimit=" + transactionLimit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wallet)) return false;
        Wallet wallet = (Wallet) o;
        return balance == wallet.balance &&
                transactionLimit == wallet.transactionLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, transactionLimit);
    }
}

