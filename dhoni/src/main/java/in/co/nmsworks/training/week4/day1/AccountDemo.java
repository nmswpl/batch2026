package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {

        AccountDemo accountDemo = new AccountDemo();
        Account wallet = new Wallet("dhoni",10000,5000);
        Account savingsAccount = new SavingsAccount("karthi",10000,5000);

        int[] transactions = {1000,1000,-5000,100,100};

        accountDemo.transaction(wallet, transactions);
        accountDemo.transaction(savingsAccount, transactions);

    }

    private void transaction(Account account, int[] transactions){

        for(int amount : transactions){
            if( amount > 0){
               int deposit =  account.deposit(amount);
                System.out.println(" deposit : " + deposit);
            }
            else {
               int withdraw = account.withdraw(-amount);
                System.out.println("withdraw : " + withdraw);
            }
        }

        System.out.println("payment history");
        for(String line : account.getLog()){
            System.out.println(line);
        }

    }
}
