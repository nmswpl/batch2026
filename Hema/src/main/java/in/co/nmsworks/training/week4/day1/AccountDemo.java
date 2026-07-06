package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {

        AccountDemo accountDemo = new AccountDemo();
        int[] inputTransactions = {2000, -200};
        accountDemo.transaction(new Wallet(500,2000),inputTransactions);
        accountDemo.transaction(new SavingsAccount(1000,1000),inputTransactions);

    }

    public void transaction(Account account, int[] transactions)
    {
        for (int transaction : transactions) {
            if( transaction < 0 )
            {
                Integer balance = account.withdraw(Math.abs(transaction));
                System.out.println("BALANCE = "+balance);
            }
            else if( transaction > 0)
            {
                Integer balance = account.deposit(transaction);
                System.out.println("BALANCE = "+balance);
            }
            else
            {
                System.out.println("Invalid data!");
            }
        }
    }
}
