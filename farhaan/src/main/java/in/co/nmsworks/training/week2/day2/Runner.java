package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"farhaan","Dev",20000, "NMSWorks");
        System.out.println(emp);

        String name = "NMSWorks";
        String company = "NMSWorks";
//        System.out.println(name == company);
//        System.out.println(name.equals(company));

        Employee emp2 = new Employee(2,"aakil","Dev",25000, "NMSWorks");
        System.out.println(emp.getCOMPANY());
        System.out.println(emp2.getCOMPANY());
        Integer i1 = 5;
        Integer i2 = 5;
        System.out.println(i1 == i2);
        int i3 = i1;
//        System.out.println(emp == emp2);
//        System.out.println(emp.equals(emp2));
    }
}
