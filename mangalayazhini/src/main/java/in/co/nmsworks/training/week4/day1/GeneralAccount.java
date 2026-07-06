package in.co.nmsworks.training.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class GeneralAccount implements Account {
    int maxTransactionLimit;
    int balance = 0 ;



    public int getMaxTransactionLimit() {
        return maxTransactionLimit;
    }

    public void setMaxTransactionLimit(int maxTransactionLimit) {
        this.maxTransactionLimit = maxTransactionLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public GeneralAccount(int maxTransactionLimit, int balance) {
        this.maxTransactionLimit = maxTransactionLimit;
        this.balance = balance;
    }

    public int limit(){
        return maxTransactionLimit;
    }

    public int withdraw(int withdrawalAmount){
        if(withdrawalAmount > maxTransactionLimit){
            System.out.println("The withdrawal amount exceeds the allowed transaction limit");
            System.out.println("You can only widthdraw maximum of " + maxTransactionLimit );
            return balance;
        }
        else{
            if(withdrawalAmount > balance){
                System.out.println("Insufficient Balance");
                return balance;
            }
            else{
                balance -= withdrawalAmount;
                return balance;
            }

        }
    }

    public int deposit(int depositAmount){
        if(depositAmount > maxTransactionLimit){
            System.out.println("The deposit amount exceeds the allowed transaction limit");
            System.out.println("You can only deposit maximum of " + maxTransactionLimit);
            return balance;
        }
        else{

            balance += depositAmount;

            return balance;
        }
    }


}
