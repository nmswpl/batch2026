package in.co.nmsworks.training.week2.Day5;

public class Sbi extends Bank{
    int rate=7;
    @Override
    void rateOfInterest() {
        System.out.println("SBI :" + rate);
    }
    void calculateYearlyInterest(int principe){
        System.out.println("SBI : " + (principe*rate*year)/100);
    }
}
