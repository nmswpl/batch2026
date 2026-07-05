package in.co.nmsworks.training.week3.day5.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRunner {
    private double balance;
    private List<String> statements=new ArrayList<>();

    public static void main(String[] args) {

        BankRunner br=new BankRunner();
        br.deposit(10000.0);
        br.withdrawel(500.0);
        br.printStatements();

    }


    private void printStatements() {
        for (String statement : statements) {
            System.out.println(statement);
        }


    }
    private void withdrawel(double money) {
        if (money<getBalance()){
            double balanceUpdate = getBalance() - money;
            setBalance(balanceUpdate);
            String Statement = "Amount Debited "+ balanceUpdate;
            statements.add(Statement);
            System.out.println("Amount of "+balanceUpdate + " debited");
        }
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    private void deposit(double money) {
        double updatedBalence = getBalance() + money;
        setBalance(updatedBalence);
        String statement = "Amount Deposited "+ updatedBalence;

        statements.add(statement);
        System.out.println("Amount "+ updatedBalence +"Credited");

    }





}
