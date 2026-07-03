package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private Double balance =0.0;
    List<String> statement = new ArrayList<>();

    public Account(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Balance after deposit : " + checkbalance());
        statement.add("Amount deposited : +" + depositAmount + "   Available balance : " + balance);
    }

    void withdrawal(double withdrawalAmount){
        balance -= withdrawalAmount;
        System.out.println("Balance after withdrwan : " + checkbalance());
        statement.add("Amount withdrawn : -" + withdrawalAmount + "   Available balance : " + balance);
    }

    Double checkbalance(){
        return balance;
    }

    void bankStatement(){
        for (String stmt : statement) {
            System.out.println(stmt);
        }
    }
}
