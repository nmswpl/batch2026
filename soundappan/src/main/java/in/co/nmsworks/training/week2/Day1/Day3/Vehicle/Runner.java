package in.co.nmsworks.training.week2.Day1.Day3.Vehicle;

public class Runner {
    public static void main(String[] args) {
       /* Shape sh1=new Shape();
        Square s1=new Square(4.0);
        s1.area();
        s1.perimeter();
        Rectangle r1=new Rectangle(9.0,5.0);
        r1.area();
        r1.perimeter();
        triangle t1=new triangle(5.0,7.0,8.0,5.4);
        t1.area();
        t1.perimeter();*/
//        String []name={"dhoni","sachin"};
//Employee e1=new Employee(name[0],12000);
//System.out.println(e1.AnnualSalary());
//Manager m1=new Manager(name[1],12000,1900);
//System.out.println(m1.Add_bonus_salary());
//        Report r1=new Report();
//        System.out.println(r1.reportGenerate());
//
//        InventoryReport i1=new InventoryReport();
//        System.out.println(i1.reportGenerate());
//
//        SalesReport s1=new SalesReport();
//        System.out.println(s1.reportGenerate());

        Bike b = new Bike(101, FuelType.Petrol,new Engine(120,true),2,"KTM");
        System.out.println(b);
        Cycle c=new Cycle(101,FuelType.Electric,new Engine(50,false),2,"HERO");
        System.out.println(c);

    }
}
