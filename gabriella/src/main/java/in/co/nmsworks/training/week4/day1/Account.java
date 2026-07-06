package in.co.nmsworks.training.week4.day1;

public interface Account {

    Integer getLimit();
    Integer withdraw(Integer amount);
    Integer deposit(Integer amount);
}
