package in.co.nmsworks.training.week2.day3;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        setName(name);
        setSalary(salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    void getSal() {
        System.out.println(bonus);
    }

    @Override
    double calSalary() {
        return super.calSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                "bonus=" + bonus +
                '}';
    }
}
