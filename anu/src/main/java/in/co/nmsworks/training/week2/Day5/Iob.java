package in.co.nmsworks.training.week2.Day5;

public class Iob extends Bank{
    int rate=8;
    @Override
    void rateOfInterest() {
        System.out.println("IOB :" +rate);
    }
    void calculateYearlyInterest(int principe){
        System.out.println("IOB : " + (principe*rate*year)/100);
    }
}
