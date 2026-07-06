package in.co.nmsworks.training.week4.day1;

public class AccountDemo {

    public static void main(String[] args) {

        AccountDemo demo = new AccountDemo();

        Account savingsAccount = new SavingsAccount();
        Account wallet = new Wallet();

        int[] transactions = {10000, -2000, 300, -300};

        System.out.println("Savings Account Transactions");
        demo.transaction(savingsAccount, transactions);

        System.out.println();

        System.out.println("Wallet Transactions");
        demo.transaction(wallet, transactions);
    }

    public void transaction(Account account, int[] transactions) {

        for (int transaction : transactions) {

            if (transaction > 0) {

                account.deposit(transaction);
                System.out.println(account);

            } else {

                account.withdraw(-transaction);
                System.out.println(account);
            }
        }
    }
}