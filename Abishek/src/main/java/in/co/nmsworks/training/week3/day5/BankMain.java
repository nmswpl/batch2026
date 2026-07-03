package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Account users[] = new Account[3];
        for (int i = 0;i < users.length; i++)
        {
            List<String> ls = new ArrayList<>();
            users[i] = new Account(0,i+1,ls);
        }
        process(users);
    }

    private static void process(Account[] users){

        Scanner in = new Scanner(System.in);

        int id;
        int choice = 0;
        while(choice != 5) {
            System.out.println("Enter 1 for deposit.");
            System.out.println("Enter 2 for withdrawal.");
            System.out.println("Enter 3 for check balance.");
            System.out.println("Enter 4 for show statements.");
            System.out.println("Enter 5 for exit.");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Give your id: ");
                id = in.nextInt();
                int balance = users[id].getBalance();
                System.out.println("Enter amount to deposit: ");
                int deposit = in.nextInt();
                balance += deposit;
                users[id].setBalance(balance);
                String depo = deposit + "";
                String bal = balance + "";
                String newString = "The amount deposited is " + depo + " With added balance " + bal;
                List<String> ls = users[id].getStatement();
                ls.add(newString);
                users[id].setStatement(ls);
            }

            if (choice == 2) {
                System.out.println("Give your id: ");
                id = in.nextInt();
                int balance = users[id].getBalance();
                System.out.println("Enter amount to withdrawl: ");
                int withDraw = in.nextInt();
                if (balance < withDraw) {
                    System.out.println("Your balance is low");
                    System.out.println("Your balance is: " + users[id].getBalance());
                } else {
                    int amount = users[id].getBalance();
                    users[id].setBalance(amount - withDraw);
                    String draw = withDraw+"";
                    String bal = balance+"";
                    String newString = "The amount withdrawel is " + draw + " With less balance of " + bal;
                    List<String> ls = users[id].getStatement();
                    ls.add(newString);
                    users[id].setStatement(ls);
                    System.out.println("Successfully withdrawed");
                }
            }

            if (choice == 3) {
                System.out.println("Give your id: ");
                id = in.nextInt();
                System.out.println("Your balance is: " + users[id].getBalance());
            }
            if (choice == 4) {
                System.out.println("Give your id: ");
                id = in.nextInt();
                System.out.println(users[id].getStatement());
            }
            if (choice == 5) {
                System.out.println("Thank you");
            }
        }
    }
}
