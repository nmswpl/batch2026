package in.co.nmsworks.training.week2.Day5;

public class Kvb extends Bank{
    int rate=10;
    @Override
    void rateOfInterest() {
        System.out.println("KVB :" +rate);
    }
    void calculateYearlyInterest(int principe){
        System.out.println("KVB : " + (principe*rate*year)/100);
    }
}
