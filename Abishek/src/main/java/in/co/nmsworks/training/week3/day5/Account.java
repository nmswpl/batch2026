package in.co.nmsworks.training.week3.day5;

import java.util.List;

public class Account {
    private int balance;
    private int id;
    private List<String> Statement;

    public Account(int balance, int id, List<String> statement) {
        this.balance = balance;
        this.id = id;
        Statement = statement;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getStatement() {
        return Statement;
    }

    public void setStatement(List<String> statement) {
        Statement = statement;
    }
}
