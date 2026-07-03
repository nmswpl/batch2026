package in.co.nmsworks.training.week3.day5;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        bankAccount.withdraw(100);
        bankAccount.deposit(20);
        bankAccount.deposit(20);
        bankAccount.checkBalance();
        bankAccount.printStatements();

        bankAccount.withdraw(2000);
    }
}
