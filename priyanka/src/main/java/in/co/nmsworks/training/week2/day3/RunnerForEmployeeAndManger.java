package in.co.nmsworks.training.week2.day3;

public class RunnerForEmployeeAndManger {
    public static void main(String[] args) {
        Employee e = new Employee(9000,"Def");
        System.out.println(e);

        Manager m = new Manager(12000,"Abc");
        System.out.println(m);
    }
}
