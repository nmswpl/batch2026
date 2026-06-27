package in.co.nmsworks.training.week2.Day4;

public abstract class Bank {

    public abstract int getInterest();
    double calculateInterest(int principle){

        int interest=0;
        int rate = getInterest();
        interest = principle*rate*1;
        interest/=100;
        return interest;
    }

}
