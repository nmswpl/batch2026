package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee{
    private double bonus ;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double annualSalary(){

        double totalAnnualSalary = super.annualSalary() + bonus ;
        System.out.println("Manager Annual salary : " + totalAnnualSalary);
        return totalAnnualSalary;
    }

}
