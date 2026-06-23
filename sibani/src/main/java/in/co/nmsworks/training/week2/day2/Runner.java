package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Sibani", "SD", 30000, "NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getCompanyName());
        System.out.println(emp.getId());

        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));

        Employee emp1 = new Employee(1, "Sibani", "SD", 30000, "NMS Works");
        System.out.println(emp1);
        System.out.println(emp == emp1);
        System.out.println(emp.equals(emp1));

        Integer i1 = 5;
        Integer i2 = 5;
        System.out.println(i1 == i2);

        int i3 = i1;
        System.out.println(i3);

        System.out.println(i1 <= 5);



    }
}
