package in.co.nmsworks.training.week4.day1;

public class Interns {
    private String name;
    private int salary=0;

    public Interns(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Interns() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Interns{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

