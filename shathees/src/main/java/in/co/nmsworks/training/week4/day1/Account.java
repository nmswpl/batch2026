package in.co.nmsworks.training.week4.day1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public interface Account {
   // int balance = 1000;
    int limit();
    int withdraw(int amount);
    int deposit(int amount);

}
