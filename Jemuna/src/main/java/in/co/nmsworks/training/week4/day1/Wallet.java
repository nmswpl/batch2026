package in.co.nmsworks.training.week4.day1;

import java.util.Map;
import java.util.Scanner;

public class Wallet implements Account {
    int availableBalance =500;

    @Override
    public int limit() {
        int limit = 50000;
        return limit;
    }


    @Override
    public int withdraw(int amount) {
        if(amount<=limit() && amount<=availableBalance){
            availableBalance -= amount;
            System.out.println("An amount of "+amount+" withdrawn successfully...");
        }
        return availableBalance;
    }

    @Override
    public int deposit(int amount) {
        if(amount<=limit()){
            availableBalance += amount ;
            System.out.println("An amount of "+amount+" has been deposited into your account Successfully...");
        }
        return availableBalance;
    }
}
