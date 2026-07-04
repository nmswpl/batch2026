package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private Long accountNumber;
    private Double balance = 0d;
    private List<String> statement = new ArrayList<>();

    public List<String> getStatement() {
        return statement;
    }


    public void setStatement(String message) {
        this.statement.add(message);
    }

    public Account(String name, Long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        String message = "\n***********************************************\n";
        message = message + "\nAccount created !\n";
        message = message + "\n***********************************************\n";
        statement.add(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
