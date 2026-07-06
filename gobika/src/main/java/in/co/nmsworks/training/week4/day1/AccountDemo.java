package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Wallet wallet = new Wallet(10000,5000);
        SavingsAccount savingsAccount = new SavingsAccount(50000,10000);
        int[] transactions = {1000,-2000};
        accountDemo.transaction(wallet, transactions);
        accountDemo.transaction(savingsAccount, transactions);
    }

    private void transaction(Account account, int[] transactions) {
        boolean accountTypeWallet = account instanceof Wallet;
        if(accountTypeWallet){
            System.out.println("Wallet Account....");
        }
        else {
            System.out.println("Savings Account...");
        }
        for (int transaction : transactions) {
            if (transaction > 0){
                System.out.println("Amount Credited successfully.....  \n Current Balance : "+account.deposit(transaction));
            }
            else {
                System.out.println("Amount Debited successfully.... \n Current Balance : "+account.withdraw(-transaction));
            }
        }
    }


}
