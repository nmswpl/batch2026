package in.co.nmsworks.training.week3.day5.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int accountId;
    private  String name;
    private int balance;
    private String BankName;
    private List<String> log;
    private int count;

    public Bank(int accountId, String name, int balance, String bankName) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.BankName = bankName;
        log = new ArrayList<>();
    }

    public void showStatements(){
        System.out.println("Bank"+ getBankName());
        System.out.println("Account No : " + getAccountId());
        System.out.println("Name : " + getName());

        for(String statement : log){
            System.out.println(statement);
        }
    }

    public void checkBalance(){
        System.out.println("Account No : " + getAccountId());
        System.out.println("Name : " + getName());
        System.out.println("Balance : " + getBalance());
    }

    public void deposit(int amount){
        System.out.println("Previous Balance : " + balance);
        System.out.println("Deposited");
        int newBalance = balance + amount;
        System.out.println("Current Balance : " + newBalance);
        count++;
        log.add(count +  " Balance after deposit : " + newBalance);
    }

    public void withDrawl(int amount){

        if(balance < amount){
            System.out.println("Invalid balance");
        }

        int newBalance = balance - amount;
        System.out.println("Current Balance : " + newBalance);
        count++;
        log.add(count +  " Balance after withdrawal : " + newBalance);
        balance = newBalance;
    }


    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
