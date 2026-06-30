package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    public abstract int getRateOfIntrest();
    public int calculateIntrest(int principle){
        int intrest = 0;
        int rate = getRateOfIntrest();
        intrest = principle*1*rate;
        intrest /=100;
        return intrest;
    }

}
