package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
public class BankingSystem {
    private float amount;
    private List<String> statement = new ArrayList<>();


    public BankingSystem(float initialBalance) {
        this.amount = initialBalance;
        this.statement.add("account : " + initialBalance);
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.amount += amount;
            statement.add("deposited:" + amount);
        }
        System.out.println("desposit :"+amount);
    }

    public void withdrawal(float amount) {
        if (amount > 0 ) {
            this.amount -= amount;
            statement.add("withdrew:" + amount);
        }
        System.out.println("withdrawal : " +amount);
    }

    public void checkBalance() {
        System.out.println("current balance" + this.amount);
    }

    public List<String> getStatement() {
        return statement;
    }
}
