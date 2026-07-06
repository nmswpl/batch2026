package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {
        Wallet wallet=new Wallet(1000);
        int[] transactions = {1000,-500,2000,-3000};

        AccountDemo demo = new AccountDemo();
        demo.transaction(wallet,transactions);
        SavingsAccount savingsAccount= new SavingsAccount(1000);

        demo.transaction(savingsAccount,transactions);




    }
    public void transaction(Account account, int[] transactions){

        for (int transaction : transactions) {
            if(transaction>0){
                account.deposit(transaction);
            }
            else{
                account.withdraw(transaction);
            }
        }

    }
}
