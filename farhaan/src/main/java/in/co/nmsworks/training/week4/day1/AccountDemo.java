package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo runner = new AccountDemo();
        Account wallet = new Wallet(8000,5000);
        Account savings = new SavingsAccount(8000,2000);
        int[] savingsTransaction = {3500, -5000 , 9000, -2000};
        int[] walletTransaction = {2000, -3500 , 10000, -800};
        System.out.println("-------------- Savings Account --------------");
        runner.transaction(savings,savingsTransaction);
        System.out.println("-------------- Wallet Account --------------");
        runner.transaction(wallet,walletTransaction);
    }

    private void transaction(Account account, int[] transactions) {
        int balance = 0;
        for (int transaction : transactions) {
            if(transaction < 0){
                 balance = account.withdraw(transaction);
                System.out.println("The current balance of the account is :: " + balance);
                System.out.println("-------------------------------------");

            }
            else {
                balance = account.deposit(transaction);
                System.out.println("The current balance of the account is :: " + balance);
                System.out.println("-------------------------------------");
            }
        }
    }
}
