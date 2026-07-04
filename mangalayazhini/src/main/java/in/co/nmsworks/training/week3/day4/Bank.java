package in.co.nmsworks.training.week3.day4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> customerAccounts;

    public  void addUserAccount(Account acc){
        customerAccounts.add(acc);
    }
}
