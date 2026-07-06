package in.co.nmsworks.week2.day3;

public class Manager extends Employee{
   double bonus;



    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double salaryOfManager(){
       return annualSalary()+bonus;
   }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }

}
