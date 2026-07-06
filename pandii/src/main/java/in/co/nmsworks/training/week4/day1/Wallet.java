package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{
    int initialBalance=2000;
    int transactionLimit=1000;
    @Override
    public int limit() {
        return initialBalance;
    }

    @Override
    public int withdraw(int amount) {
        if(transactionLimit < -(amount))
        {
            System.out.print("Transaction is limit is "+transactionLimit+" u cannot take more amount ");
            return initialBalance;
        }
        else {
            if(amount>limit())
            {
                System.out.println("Ur initial balance is low cannot withdraw");
                return initialBalance;
            }
            else {
                System.out.print("Withdraw Successfully !!");

                initialBalance=initialBalance+amount;
            }
        }
        return initialBalance;
    }

    @Override
    public int deposit(int amount) {

        initialBalance=initialBalance+amount;
        System.out.print("Deposited Successfully !!");

        return initialBalance;

    }
}
