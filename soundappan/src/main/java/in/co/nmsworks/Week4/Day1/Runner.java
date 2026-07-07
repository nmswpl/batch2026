package in.co.nmsworks.Week4.Day1;

public class Runner {
    public static void main(String[] args) {
        AccountDemo demo = new AccountDemo();

        Account savings = new SavingAccount(10000, 5000);
        Account wallet = new Wallet(3000, 1000);

        int[] transactions = {1000, -500, 6000, -1200, 2000};

        demo.transaction(savings, transactions);
        demo.transaction(wallet, transactions);
    }
}
