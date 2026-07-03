package in.co.nmsworks.training.week3.day5;

public class AccountRunner {
    public static void main(String[] args) {
        AccountRunner accountRunner = new AccountRunner();
        accountRunner.run();
    }

    private void run() {
        Account sibani = new Account( "Sibani");
        sibani.deposit(10000.00);
        sibani.withdrawal(1000.00);
        sibani.withdrawal(1000.00);
        sibani.withdrawal(1000.00);
        sibani.deposit(1000.00);

        System.out.println("****************************************");
        sibani.bankStatement();
    }
}
