package in.co.nmsworks.training.week2.Day5.Abstract;

public class BankRunner{
    public static void main(String[] args) {
        Iob account=new Iob();
        Bank(account);

    }

    private static void Bank(Iob account) {
        account.getRateOfIntrest(2000.0);
        account.setPrinciple(28900.0);
        account.simpleIntrest();
    }

}
