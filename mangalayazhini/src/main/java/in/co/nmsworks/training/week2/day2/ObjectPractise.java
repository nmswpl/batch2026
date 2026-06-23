package in.co.nmsworks.training.week2.day2;

public class ObjectPractise {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer(101,"Nithya Sri");
        BankCustomer customer2 = new BankCustomer(102, "Aambal");
        BankCustomer customer3 = new BankCustomer(101,"Nithya");

        if(customer1.equals(customer3)){
            System.out.println("\nSame Customer");
        }
        else{
            System.out.println("\nDifferent Customer");
        }


        Trainee trainee1 = new Trainee("Muthazhagi");
        Trainee trainee2 = new Trainee("Nasmeya");
        Trainee trainee3 = new Trainee("Harinitha");
        Trainee trainee4 = new Trainee("Priya");
        Trainee trainee5 = new Trainee("Harini");

        System.out.println(trainee1);
        System.out.println(trainee2);
        System.out.println(trainee3);
        System.out.println(trainee4);
        System.out.println(trainee5);


        Trainee[] traineeArr = new Trainee[5];
        for (int i = 0; i < traineeArr.length; i++) {
            traineeArr[i] = new Trainee("Name " + i);
        }


        for (int i = 0; i < traineeArr.length; i++) {
            System.out.println(traineeArr[i].getName());
        }






    }
}


class BankCustomer{
    private int id ;
    private String name ;

    BankCustomer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if( id == ((BankCustomer)obj).getId()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

