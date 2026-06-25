package in.co.nmsworks.training.week2.day2;

public class RunnerEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Anu","it",70000,"NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getId());

        System.out.println(emp.getCOMPANY());

        Employee emp2 = new Employee(1,"Anu","it",70000,"Amazon");
        //System.out.println(emp2);

        System.out.println(emp2.getCOMPANY());
        System.out.println(emp==emp2); //its compare the address
        System.out.println(emp2.equals(emp));

        String name="NMSWorks";
        String company ="NMSWorks";
        System.out.println(name==company);
        System.out.println(name.equals(company));

        Integer i1=5;
        Integer i2=5;
        System.out.println(i1==i2);

        int i3=i1; //Auto Boxing
        System.out.println(i3);

        System.out.println(i1<5); //Auto Boxing
    }
}
