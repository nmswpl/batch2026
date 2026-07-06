package in.co.nmsworks.training.week3.day5;

import com.sun.crypto.provider.DESParameters;

import java.util.ArrayList;
import java.util.List;

public class   BankAccount {
    int balance;
    List<String> statement = new ArrayList<>();

    public void deposit(int depAmt) {
        balance = balance + depAmt;
        statement.add(" DEPOSITED   : " + depAmt);
        System.out.println("Rs." + depAmt + " deposited successfully");
        System.out.println(" CURRENT BALANCE : " + balance );

    }
    public void withdrawal(int withdrawalAmt){
        if(balance >= withdrawalAmt) {
            balance = balance - withdrawalAmt;
            statement.add(" WITHDRAWED   : " + withdrawalAmt);
            System.out.println("Rs." + withdrawalAmt + " withdrawed successfully");
            System.out.println(" CURRENT BALANCE : " + balance );
        }else{
            System.out.println("Out of balance");
        }
    }

    public void checkBalance(){
        System.out.println(" BALANCE      : " + balance);
    }

    public void showStatement() {

        System.out.println("-----STATEMENT------");
        for (String s : statement) {
            System.out.println(s);
        }
        System.out.println("----------------------");
        System.out.println(" BALANCE : " + balance );
        System.out.println("----------------------");

    }
}
