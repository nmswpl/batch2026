package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
//    private Long accountNumber;
    private Integer accountBalance;

    List<String> statements=new ArrayList<>();

    public BankAccount(Integer accountBalance) {
        this.accountBalance = accountBalance;
        statements.add("Initial account balance is "+accountBalance);
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(Integer amt)
    {
        accountBalance+=amt;
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Deposit SuccessFully");

        statements.add("deposited "+amt +" and account balance "+accountBalance);


    }
    public void withDraw(Integer amt)
    {
        if(amt>accountBalance)
        {
            System.out.println("Withdrawal money is not greater than account balance");
        }
        else {
            accountBalance-=amt;
            System.out.println("Withdraw Successfully !! ");
            System.out.println(accountBalance+" balance after withdrawal");
        }
        statements.add("withdraw "+amt +" and account balance "+accountBalance);
    }
    public void checkBalance()
    {
        System.out.println("Your account balance "+accountBalance);
    }
    public void showStatements()
    {
        for (String statement : statements) {
            System.out.println(statement);
        }
    }


}
