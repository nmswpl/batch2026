package in.co.nmsworks.training.week4.day1;

public class AccountDemo {
    public static void main(String[] args) {


        AccountDemo demo = new AccountDemo();

        Wallet wallet = new Wallet();
        SavingsAccount acc = new SavingsAccount();
        int[] transactions = {200, -500, 300, 600, -400};
        System.out.println(" Wallet ");
        demo.transaction(wallet, transactions);
        System.out.println();
        System.out.println(" Account ");
        demo.transaction(acc, transactions);

    }

    private void transaction(Account wallet, int[] transactions) {
        for(int t : transactions){
            if(t >= 0){
                System.out.println("Available balance : " + wallet.deposit(t));

            }
            else{
                System.out.println("Available balance : " +wallet.withdraw(-t));
            }

        }

    }

}
