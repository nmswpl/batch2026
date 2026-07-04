package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    List<Account> accountList = new ArrayList<>();

    public Account getAccount(Long number)
    {
        for (Account account : accountList) {
            if(number.equals(account.getAccountNumber()))
            {
                return account;
            }
        }

        return null;
    }

    public void deposit(Long number, Double depositAmount)
    {
        Account account = getAccount(number);
        Double amount = account.getBalance()+depositAmount;
        account.setBalance(amount);

        String message = "\n***********************************************\n";
        message = message + "\nAmount deposited : "+depositAmount;
        message = message + "\n Balance : "+amount;
        message = message + "\n\n***********************************************\n";

        account.setStatement(message);

        System.out.println("Balance = "+amount);

    }

    public void withdrawal(Long number, Double withdrawalAmount)
    {
        Account account = getAccount(number);
        if( withdrawalAmount <= account.getBalance() )
        {
            Double amount = account.getBalance() - withdrawalAmount;
            account.setBalance(amount);

            String message = "\n***********************************************\n";
            message = message + "\nAmount withdrawded : "+withdrawalAmount;
            message = message + "\n Balance : "+amount;
            message = message + "\n\n***********************************************\n";
            account.setStatement(message);


            System.out.println("Balance = "+amount);
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance(Long number)
    {
        Account account = getAccount(number);
        System.out.println("Balance = "+account.getBalance());
    }

    public void statement(Long number)
    {
        Account account = getAccount(number);
        List<String> stmt = account.getStatement();

        System.out.println("Account statement : \n\n");
        System.out.println(stmt);

    }

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();
        bank.accountList.add(new Account("Hema", 101l));
        bank.accountList.add(new Account("Thanu", 102l));

        bank.deposit(101l,5000d);
        bank.withdrawal(101l,3000d);
        bank.withdrawal(101l,3000d);
        bank.checkBalance(101l);

        bank.statement(101l);

        bank.statement(102l);


    }
}
