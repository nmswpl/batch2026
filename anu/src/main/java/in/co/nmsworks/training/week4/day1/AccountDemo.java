package in.co.nmsworks.training.week4.day1;

public class AccountDemo {

    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Account wallet = new Wallet(500,5000);
        Account savingsAccount = new SavingsAccount(200,2000);
        int[] transactions={300,140,-40};
        System.out.println("wallet transaction ");
        accountDemo.transaction(wallet,transactions);
        System.out.println("saving account transaction");
        accountDemo.transaction(savingsAccount,transactions);
    }

    void transaction(Account account, int[] transactions) {
        for (int amount : transactions) {
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Deposited: " + amount + " update Balance: " + account.getBalance());
            } else if (amount < 0) {
                account.withdraw(-amount);
                System.out.println("Withdrew: " + amount + "  update Balance: " + account.getBalance());
            }
        }
    }
}
