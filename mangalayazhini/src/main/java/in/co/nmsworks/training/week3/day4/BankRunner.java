package in.co.nmsworks.training.week3.day4;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
        Bank sbiBank = new Bank();
        Scanner scan = new Scanner(System.in);

        Account acc1 = new Account("400500101","Priya",1000.0);

        acc1.checkBalance();
        acc1.deposit(500.0);
        acc1.deposit(500.0);
        acc1.withdrawal(1000.0);
        acc1.deposit(500.0);
        acc1.showStmt();
        acc1.checkBalance();



        Account acc2 = new Account("400600700","Renu",1000.0);
        acc2.checkBalance();
        acc2.deposit(2000.0);
        acc2.deposit(1000.0);
        acc2.withdrawal(1000.0);
        acc2.deposit(500.0);
        acc2.showStmt();
        acc2.checkBalance();

//
//        sbiBank.addUserAccount(acc1);
//        sbiBank.addUserAccount(acc2);
    }
}
