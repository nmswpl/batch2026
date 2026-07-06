package in.co.nmsworks.training.week4.day1.bankAccount;

public interface Account {
    int limit();
    int withdraw(int amount);
    int deposit(int amount);
}
