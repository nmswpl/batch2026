package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        AccountDemo accountDemo=new AccountDemo();
        Wallet wallet=new Wallet();
        SavingsAccount savingsAccount=new SavingsAccount();

        int[] transactions ={1000,200,-200,500};
        int[] transactionSavingAccount ={100000,200,-20000,500};

        accountDemo.transaction(wallet,transactions);
        accountDemo.transaction(savingsAccount,transactionSavingAccount);
    }

    private void transaction(Account account, int[] transactions) {
        int balance=0;
        for (int transaction : transactions) {
            if(transaction>0)
            {
                balance=account.deposit(transaction);
                System.out.println(" Your Savings Account balance is "+balance);
            }
            else {
                balance=account.withdraw(transaction);
                System.out.println(" Your Savings Account balance is "+balance);

            }
        }
    }
}
