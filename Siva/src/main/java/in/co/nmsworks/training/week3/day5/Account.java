package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Double amount;
    List<String> statement = new ArrayList<>();

    public Account() {
    }

    public Account(Double amount) {
        this.amount = amount;
        statement.add("Cr - "+amount+" Account Balance - "+amount);
    }

    public void deposit(Double creaditAmount) {
        if (creaditAmount <= 0) {
            System.out.println("Amount should be greater than zero!!");
            return;
        }
        amount += creaditAmount;
        statement.add("Cr - "+creaditAmount+" Account Balance - "+amount);
        System.out.println("Payment credited sucessfully!!");
    }

    public void withdrawal(Double debitAmount) {
        if (debitAmount <=0) {
            System.out.println("Amount should be greater than zero!!");
            return;
        }
        if (debitAmount > amount) {
            System.out.println("Insufficient Balance!! your balance is "+amount);
            return;
        }
        amount -= debitAmount;
        statement.add("De - "+debitAmount+" Account Balance - "+amount);
        System.out.println("Payment debited sucessfully!!");
    }

    public void printBalance() {
        System.out.println("Balance :: "+amount);
    }

    public void printStatement() {
        System.out.println("===================== Statement ========================");
        for (String s : statement) {
            System.out.println(s);
        }
    }

}
