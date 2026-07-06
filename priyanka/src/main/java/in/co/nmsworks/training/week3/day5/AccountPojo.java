package in.co.nmsworks.training.week3.day5;


import java.util.ArrayList;
import java.util.List;

public class AccountPojo {
    int accNumber;
    int balance=0;

    List<String> statements = new ArrayList<>();

    public AccountPojo(int accNumber) {
        this.accNumber = accNumber;
//        this.balance = balance;

    }

    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("amount deposited..");
        statements.add(amount+" deposited.");
    }
    public int withdrawl(int amount){
        if(chechBalance() > amount){
            System.out.println("amount withdrawed");
            balance= balance-amount;
            statements.add(amount + " withdrawed.");
            return balance;
        }
        else {
            System.out.println("Insufficient balance");
            return 0;
        }
    }

    public int chechBalance() {
        System.out.println(balance);
        return balance;
    }

    public void showStatements(){
        System.out.println("===========Statement=========");
        System.out.println("Acc Number: "+ accNumber);
        for (String statement : statements) {
            System.out.println(statement);
        }
        System.out.println("Balance: "+balance);

    }


}
