package in.co.nmsworks.week4.day1;

public class MainAccount {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(5000, 10000);
        SavingsAccount savingsAccount = new SavingsAccount(2000, 15000);


        int[] transaction = {3000, -4000, 1000, -2000};
        AccountDemo accountDemo = new AccountDemo();

        System.out.println("-----Wallet account-----");
        accountDemo.transaction(wallet, transaction);
        System.out.println();
        System.out.println("-----Savings account-----");
        accountDemo.transaction(savingsAccount, transaction);


    }
}
