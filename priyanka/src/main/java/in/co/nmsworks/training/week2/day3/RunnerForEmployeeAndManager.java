package in.co.nmsworks.training.week2.day3;

public class RunnerForEmployeeAndManager {
    public static void main(String[] args) {
        Employee employee = new Employee(9000,"Def");
        System.out.println(employee);

        Manager manager = new Manager(12000,"Abc");
        System.out.println(manager);
    }
}
