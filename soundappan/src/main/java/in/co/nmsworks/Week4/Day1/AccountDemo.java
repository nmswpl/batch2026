package in.co.nmsworks.Week4.Day1;

public class AccountDemo {

    public void transaction(Account account, int[] transactions) {
        for (int value : transactions) {
            if (value > 0) {
                System.out.println("Amount Deposit : " + value);
                System.out.println("Balance : " + account.deposit(value));
            } else if (value < 0) {
                System.out.println("Amount Withdraw : " + (-value));
                System.out.println("Balance : " + account.withdraw(-value));
            } else {
                System.out.println("Invalid Transaction");
            }
        }
        System.out.println("-----------------------------");
    }
}