package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args){
        Employee emp = new Employee(1, "Gaby", "IT", 40000);

        System.out.println(emp);
        System.out.println(emp.getId());

        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));

        Employee emp2 = new Employee(1, "Gaby", "IT", 40000);

        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));

        System.out.println(emp.toString());
        System.out.println(emp2.toString());


        // Autoboxing
        Integer i1 = 5;
        Integer i2 = 5;
        System.out.println(i1 == i2);

        //Auto unboxing
        int i3 = i1;
        System.out.println(i1 < 5);




    }
}
