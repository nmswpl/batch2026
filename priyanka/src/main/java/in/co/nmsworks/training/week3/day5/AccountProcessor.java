package in.co.nmsworks.training.week3.day5;

public class AccountProcessor {
    public static void main(String[] args) {
        AccountProcessor bank = new AccountProcessor();
        bank.accountOperations();
    }

    private void accountOperations() {
        Account acc = new Account(1001);
        acc.chechBalance();
        acc.deposit(1000);
        acc.chechBalance();
        acc.withdrawl(500);
        acc.chechBalance();
        acc.showStatements();
    }
}
