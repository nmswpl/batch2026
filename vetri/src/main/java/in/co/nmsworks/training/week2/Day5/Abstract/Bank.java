package in.co.nmsworks.training.week2.Day5.Abstract;

public  abstract class Bank {
    Double rateOfIntrest;
    Double principle;
    int year=1;

    public void getRateOfIntrest(Double rateOfIntrest) {
        this.rateOfIntrest=rateOfIntrest;
    }

    public void simpleIntrest(){
        System.out.println(rateOfIntrest+principle+year);
    }

    public void setPrinciple(Double principle) {
        this.principle = principle;
    }
}
