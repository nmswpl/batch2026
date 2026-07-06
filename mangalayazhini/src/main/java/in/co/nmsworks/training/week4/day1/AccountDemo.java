package in.co.nmsworks.training.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class AccountDemo {
    public static void main(String[] args) {

        AccountDemo accDemo = new AccountDemo();

        WalletAccount myWalletAcc = new WalletAccount(5000, 1000);
        SavingsAccount mySavingsAcc = new SavingsAccount(2000, 1000);

        List<Integer> transactionHistory = new ArrayList<>();
        transactionHistory.add(6000);
        transactionHistory.add(-500);
        transactionHistory.add(300);
        transactionHistory.add(3000);
        transactionHistory.add(-5000);



        accDemo.transcation(myWalletAcc, transactionHistory);
        accDemo.transcation(mySavingsAcc, transactionHistory);

        System.out.println("Final Balance of Wallet Account: " + myWalletAcc.getBalance());
        System.out.println("Final Balance of Savings Account: " + mySavingsAcc.getBalance());





    }


    public void transcation(Account acc, List<Integer> transcations){
        for (Integer transcation : transcations) {
            if(transcation > 0){
                acc.deposit(transcation);
            }
            else{
                acc.withdraw(-1 * (transcation));
            }
        }

    }
}
