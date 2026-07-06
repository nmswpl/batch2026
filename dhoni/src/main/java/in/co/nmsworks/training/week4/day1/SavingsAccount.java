package in.co.nmsworks.training.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements Account{
    private  String name;
    private float balance;
    private float transactionLimit;
    private float currentUsage;
    private List<String> log;

    public SavingsAccount(String name, float balance, float transactionLimit) {
        this.name = name;
        this.balance = balance;
        this.transactionLimit = transactionLimit;
        log = new ArrayList<>();;
        log.add(log.size() + " " + name + " account created with balance of : " + balance);

    }

    @Override
    public int limit() {

        if(transactionLimit >= currentUsage){
            return (int) (transactionLimit - (currentUsage));
        }
        return 0;
    }

    @Override
    public int withdraw(int amount) {

        if(limit() >= amount && balance >= amount){
            //System.out.println("amount withdraw : " + amount);
            //System.out.println("current balance : " + (balance-amount));
            log.add( log.size() + " amount withdraw :"+ amount + "\n current balance : " + (balance-amount));
            setCurrentUsage(transactionLimit-amount);
            return amount;
        }
        else {
            System.out.println("Limit reached");
        }

        return 0;
    }

    @Override
    public int deposit(int amount) {
        if(limit() >= amount && balance >= amount){
            //System.out.println("amount deposit : " + amount);
            //System.out.println("current balance : " + (balance-amount));
            log.add( log.size() + " amount deposit :"+ amount + "\n current balance : " + (balance-amount));
            setCurrentUsage(transactionLimit-amount);
            return amount;
        }
        else {
            System.out.println("Reached limit");
        }

        return 0;
    }

    @Override
    public List<String> getLog(){
        return log;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(float transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public float getCurrentUsage() {
        return currentUsage;
    }

    public void setCurrentUsage(float currentUsage) {
        this.currentUsage = currentUsage;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }
}
