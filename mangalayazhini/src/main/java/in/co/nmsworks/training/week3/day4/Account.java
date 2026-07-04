package in.co.nmsworks.training.week3.day4;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNo;
    private String name;
    private Double balance = 0.0 ;
    private List<String> transStmts = new ArrayList<>();

    public Account(String accountNo, String name, Double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(Double depositedAmt){
        balance += depositedAmt;
        transStmts.add("You current balance after depositing " + depositedAmt +" is : "+balance);
    }

    public void withdrawal(Double withdrawedAmt) {
        if(withdrawedAmt > balance){
            System.out.println("Insufficient balance , cannot withdraw !");
        }
        else{
            balance -= withdrawedAmt;
            transStmts.add("You current balance after withdrawing " + withdrawedAmt +" is : "+balance);

        }

    }

    public Double checkBalance(){
        System.out.println("\nBalance of "+ accountNo + " : "+balance);
        return balance;
    }

    public void showStmt(){
        System.out.println("\nStatements of your bank account");
        System.out.println("Account no : "+ accountNo +"\nUserName : "+name);
        for (String transStmt : transStmts) {
            System.out.println(transStmt);
        }
    }


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
