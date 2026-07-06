package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        accountDemo.run();
    }

    private void run() {
        Account siva = new SavingsAccount(0,50000);
        Account pandi = new Wallet(500,80000);
        int[] transactions1 = {1000,2500,-3000,500,-1000};
        int[] transactions2 = {10000,25000,-30000,5000,-1000};
        transaction(siva,transactions1);
        transaction(pandi,transactions2);
    }

    private void transaction(Account account, int[] transactions) {
        for (int transaction : transactions) {
            if (transaction > 0) {
                int balance = account.deposit(transaction);
                if (balance == Integer.MAX_VALUE) {
                    System.out.println("Insufficient Balance");
                }
                else if (balance == Integer.MIN_VALUE) {
                    System.out.println("Amount should be less than limit");
                }
                else {
                    System.out.println("Amount Credited Sucessfully!!!\nAvailable balance :: "+balance);
                }
            }
            else if (transaction < 0) {
                int balance = account.withdraw(transaction*-1);
                if (balance == Integer.MAX_VALUE) {
                    System.out.println("Insufficient Balance");
                }
                else if (balance == Integer.MIN_VALUE) {
                    System.out.println("Amount should be less than limit");
                }
                else {
                    System.out.println("Amount Debited Sucessfully!!!\nAvailable balance :: "+balance);
                }
            }
        }
    }
}
