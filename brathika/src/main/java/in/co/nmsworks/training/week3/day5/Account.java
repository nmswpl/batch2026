package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Integer Name;
    private Double balance = 0.0;
    List<String> statement = new ArrayList<>();

    public Integer getName() {
        return Name;
    }

    public void setName(Integer name) {
        Name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<String> getStatement() {
        return statement;
    }

    public void setStatement(List<String> statement) {
        this.statement = statement;
    }
}
