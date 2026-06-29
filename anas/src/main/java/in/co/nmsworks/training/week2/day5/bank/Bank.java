package in.co.nmsworks.training.week2.day5.bank;

public abstract class Bank {


    double calculateYearlyInterest(int principle,int year){
        double interest = (principle * year * getRate()) / 100;
        System.out.println(interest);
        return interest;
    }

    abstract double  getRate();

}
