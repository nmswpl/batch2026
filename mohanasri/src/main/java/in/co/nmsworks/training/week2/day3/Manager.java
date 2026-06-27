package in.co.nmsworks.training.week2.day3;
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salaryPerMonth, double bonus) {
        super(name, salaryPerMonth);
        this.bonus = bonus;
    }
        @Override
        public double annualSalary() {
            return super.annualSalary() + this.bonus;
        }


}




