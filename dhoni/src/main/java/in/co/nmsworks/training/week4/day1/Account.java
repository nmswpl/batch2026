package in.co.nmsworks.training.week4.day1;

import java.util.List;

public interface Account {
    int limit();
    int withdraw(int amount);
    int deposit(int amount);
    List<String> getLog();
}
