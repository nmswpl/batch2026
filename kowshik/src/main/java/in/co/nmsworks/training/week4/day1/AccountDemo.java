package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {

        int[] transactions = {1000, -2000, 5000, 16000, -15000, -16000};
        transaction(new Wallet(20000), transactions);
        transaction(new SavingsAccount(30000), transactions);
    }

    public static void transaction(Account account, int[] transactions) {
        for (int transaction : transactions) {
            if (transaction > 0) {
                account.deposit(transaction);
            }
            else {
                account.withdraw(transaction);
            }
        }
    }
}
