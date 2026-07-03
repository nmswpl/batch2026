package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Integer balance = 5000;
    private List<String> statements = new ArrayList<>();

    public void deposit(Integer amount){
        balance += amount;
        statements.add("\nAmount deposited : "+amount.toString() + "  Current Balance : "+balance) ;
        System.out.println("Amount deposited successfully...");
    }
    public void withdrawal(Integer amount){
        balance -= amount;
        statements.add("\nAmount debited : "+amount.toString() +"  Current Balance : "+balance);
        System.out.println("withdrawal successfully");
    }
    public void checkBalance(){
        System.out.println(balance);
    }

    public void showStatements(){
        System.out.println("Bank Statement : "+statements);
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
