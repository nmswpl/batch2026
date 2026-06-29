package in.co.nmsworks.training.week2.Day1.Day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"Soundappan","IT",50000,"NMSWorks");
        Employee emp2=new Employee(101,"Soundappan","IT",50000,"NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getId());

        String name="NMSWorks";
        String company="NMSWorks";
        Integer i1=5;
        Integer i2=5;

        int i3=i1;
        int i4=i2;

        String myname=String.valueOf(i1);
        String text="dhoni";
        System.out.println(text.replaceAll("H","0"));
        System.out.println(emp==emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp.toString());
        System.out.println(i1==i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i1<5);

    }
}
