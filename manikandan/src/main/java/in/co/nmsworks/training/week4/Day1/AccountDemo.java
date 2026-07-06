package in.co.nmsworks.training.week4.Day1;

public class AccountDemo {

    public static void transaction(Account account, int[] transactions) {
        for (int amount : transactions) {
            int updatedBalance;
            if (amount > 0) {
                System.out.println("Attempting to deposit: " + amount);
                updatedBalance = account.deposit(amount);
            } else if (amount < 0) {

                int withdrawalAmount = Math.abs(amount);
                System.out.println("Attempting to withdraw: " + withdrawalAmount);
                updatedBalance = account.withdraw(withdrawalAmount);
            } else {
                continue;
            }
            System.out.println("Current Balance: " + updatedBalance);
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {

        System.out.println("-------Wallet------");
        Account myWallet = new Wallet(5000, 9000);
        int[] wallet = {100, -150, -600, 300};
        transaction(myWallet, wallet);

        System.out.println("\n------Savings Account------");
        Account mySavings = new SavingsAccount(10000, 5000);
        int[] savings = {-400, 200, -900};
        transaction(mySavings, savings);
    }
}