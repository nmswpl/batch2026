package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Wallet wallet = new Wallet(10000, 500);
//        System.out.println(wallet.getBalance());
//        System.out.println(wallet.deposit(200));
//        System.out.println(wallet.withdraw(300));

        Integer[] transactions = {100, 200, 300, -300};
        accountDemo.transaction(wallet, transactions);
        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount(200000, 10000);
        Integer[] transactions2 = {20000, 3000, -2000};
        accountDemo.transaction(savingsAccount, transactions2);

    }
    public void transaction(Account account, Integer[] transactions){
        for (Integer transaction : transactions) {
            if (transaction > 0){
                System.out.println(account.deposit(transaction));
            } else {
                System.out.println(account.withdraw(-transaction));
            }
        }

    }
}
