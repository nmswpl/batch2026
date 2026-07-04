package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accNo;
    private  String name;
    private int balance;
    List<String>statemnt;

    public Account(int accNo, String name, int balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        statemnt = new ArrayList<>();
        statemnt.add("Account create inital balance : "+balance);
    }

    public void showStatement(){
        statemnt.add("Acc No:  "+accNo+"  Name :  "+name+"  Balance:  "+balance);
        for (String s : statemnt) {
            System.out.println(s);

        }
    }
    public void deposit(int amount){
        if (amount > balance){
            System.out.println("Invalid input");
        }
        balance += amount;
        statemnt.add("amount deposited "+amount);


    }
    public int withDraw(int amount){
        if(amount < 0){
            System.out.println("Invalid input");
        }else {
            balance -= amount;
        }
        statemnt.add("amount withdraw : "+amount);
        return amount;

    }

    public int checkBalance(){
        return balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
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

    public List<String> getStatemnt() {
        return statemnt;
    }

    public void setStatemnt(List<String> statemnt) {
        this.statemnt = statemnt;
    }
}