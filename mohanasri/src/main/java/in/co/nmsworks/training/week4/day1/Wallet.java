package in.co.nmsworks.training.week4.day1;

import javax.sound.midi.Soundbank;

public class Wallet implements Account{

    int initialBalance = 5000;
    int limit = 4000;


    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {

        if(amount > limit && amount > initialBalance){
            System.out.println("Can't withdraw ");
            return initialBalance;
        }
        else {
            initialBalance = initialBalance - amount;
            System.out.println(amount + " Withdrawed");

            return initialBalance;
        }
    }

    @Override
    public int deposit(int amount) {

        if (amount > limit) {
            System.out.println("Can't deposit");
            return initialBalance;
        } else {
            initialBalance += amount;
            System.out.println(amount + " Amount deposited successfully!!");

            return initialBalance;
        }
    }
}
