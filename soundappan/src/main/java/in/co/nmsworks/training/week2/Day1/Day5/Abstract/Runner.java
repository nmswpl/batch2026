package in.co.nmsworks.training.week2.Day1.Day5.Abstract;

public class Runner {
    public static void main(String[] args) {
        BankAccount sbi = new Sbi(1000, 2.5);
        BankAccount tmb=new Tmb(1000,3.2);
        BankAccount iob=new Iob(1000,4.0);
        printInterest(sbi);
        printInterest(tmb);
        printInterest(iob);
    }
        private static void printInterest (BankAccount bank){
            System.out.println(bank.getPrincipal());
            System.out.println(bank.getRateOfInterest());
            System.out.println(bank.calculateInterestForYear());
        }
    }



