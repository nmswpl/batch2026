package in.co.nmsworks.training.week4.day1.bankAccount;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        SavingsAccount savingsAccount = new SavingsAccount(100000,50000);
        Wallet wallet = new Wallet(100000,20000);
        int[] transactions = {12000, 3000,4000,-40000,-1200};
        accountDemo.transaction(savingsAccount, transactions);
        accountDemo.transaction(wallet,transactions);
    }

    void transaction(Account account, int[] transactions){

        for (int i : transactions) {
            if ( i < 0 ){
                System.out.println("WITHDRAW");
                System.out.println("balalce : " + account.withdraw(i * -1));
            }
            else if (i > 0) {
                System.out.println("DEPOSIT");
                System.out.println("balance : " + account.deposit(i));
            }
            else {
                System.out.println("Transaction not possible");
            }
        }

    }


}
