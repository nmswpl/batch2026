package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    static void transaction(Account account, int[] transactions){
        for (int transaction : transactions) {
            if (transaction > 0){
                System.out.println("Amount balance after deposit :"+ account.deposit(transaction));
            } else if (transaction < 0) {
                System.out.println("amount balance after withdraw :"+account.withdraw(-1*transaction));
            }

        }

    }
    public static void main(String[] args) {
        Account account = new SavingsAccount(1000,4000);
        Account account1 = new Wallet(1000,5000);
        int []transactions = {1000,-1000};


        transaction(account,transactions);
    }
}
