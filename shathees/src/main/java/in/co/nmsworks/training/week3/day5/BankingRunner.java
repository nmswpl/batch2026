package in.co.nmsworks.training.week3.day5;

public class BankingRunner {
    public static void main(String[] args) {
        Account sbi = new Account(101,"shathees",10000);
        sbi.deposit(5000);
        sbi.withDraw(1000);
       // System.out.println("withdraw :"+withdraw);
        sbi.showStatement();
        System.out.println("------------------");
        sbi.deposit(5000);
        sbi.withDraw(1000);sbi.showStatement();
        System.out.println("-------------");
        sbi.deposit(5000);
        sbi.withDraw(1000);
        sbi.showStatement();





    }
}
