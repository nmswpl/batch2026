package in.co.nmsworks.training.week4.day1;

public class AccountDemo {

    public static void transaction(Account account, int[] transactions) {
        for (int t : transactions) {
            int balance;

            if (t > 0) {
                balance = account.deposit(t);
            } else {

                balance = account.withdraw(-t);
            }

            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Account wallet = new Wallet(1000, 500);
        int[] walletTransactions = {200, -100, 600, -1200, -300};

        System.out.println("Wallet Transactions:");
        transaction(wallet, walletTransactions);

        System.out.println("\n-----------------------------------\n");

        Account savings = new SavingsAccount(5000, 1000);
        int[] savingsTransactions = {500, -700, 1500, -6000, -500};

        System.out.println("Savings Account Transactions:");
        transaction(savings, savingsTransactions);
    }
}