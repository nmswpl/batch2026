package in.co.nmsworks.training.week2.day5.abstractPractice;

public abstract class Bank {
    private double principle;

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public abstract double getRateOfInterest();

    public double calculateYearlyInterest(){
        return  (principle * getRateOfInterest())/100;
    }

}
