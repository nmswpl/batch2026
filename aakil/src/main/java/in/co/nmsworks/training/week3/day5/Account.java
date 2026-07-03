package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private int balance;
    private List<Integer> statements;

    public Account(int id) {
        statements = new ArrayList<>();
        this.id = id;
        balance = 0;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Integer> getStatements() {
        return statements;
    }

    public void setStatements(List<Integer> statements) {
        this.statements = statements;
    }
}
