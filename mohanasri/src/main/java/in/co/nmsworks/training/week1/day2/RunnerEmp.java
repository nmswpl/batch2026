package in.co.nmsworks.training.week1.day2;

public class RunnerEmp {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Mohanasri");
        emp1.setDept("Software Engineer");
        emp1.setSalary(100000);
        emp1.setIsFullTime(true);

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Brathika");
        emp2.setDept("Software Engineer");
        emp2.setSalary(200000);
        emp2.setIsFullTime(true);

        System.out.println("Employee 1: " + emp1.getName() + ", Dept: " + emp1.getDept());
        System.out.println("Employee 2: " + emp2.getName() + ", Dept: " + emp2.getDept());
    }
}

