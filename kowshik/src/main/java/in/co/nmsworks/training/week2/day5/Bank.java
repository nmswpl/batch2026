package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void calculateYearlyInterest(double principle){
        double si = ((principle * getRateOfInterest())/100);

        System.out.println("Simple Interest for " + bankName + " : " + si);
    }

    public abstract double getRateOfInterest();
}
