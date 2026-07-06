package in.co.nmsworks.training.week3.day5;

public class BankingRunner {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("________________________________________________________________________");
        account.withdrawal(3000);
        account.checkBalance();
        account.deposit(5000);
        account.checkBalance();
        account.withdrawal(3000);
        account.checkBalance();
        account.withdrawal(3000);
        account.withdrawal(200);
        account.checkBalance();
        account.deposit(500);
        account.checkBalance();
        account.getStatement();
    }
}
