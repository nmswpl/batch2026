package in.co.nmsworks.week4.day1;

public class AccountDemo {

    public void transaction(Account account, int[] transactions) {
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                System.out.println("Your Balance after deposit of" + transactions[i] + " is" + account.deposit(transactions[i]));
            } else {
                System.out.println("Your Balance after withdraw of" + transactions[i] + " is" + account.withdraw(transactions[i]));
            }
        }
    }


}
