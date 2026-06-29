package in.co.nmsworks.training.week2.day2;

public class ObjectPractice{

    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Gobika");
        Customer c2 = new Customer(2, "Sibani");

        if (c1.equals(c2)){
            System.out.println("Same Customer");
        }
        else {
            System.out.println("Different Customer");
        }


        Trainee t1 = new Trainee("Gobika");
        Trainee t2 = new Trainee("Sibani");
        Trainee t3 = new Trainee("Brathika");
        Trainee t4 = new Trainee("Yaalini");
        Trainee t5 = new Trainee("Jemuna");
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//        System.out.println(t4);
//        System.out.println(t5);

        String[] strArray = {"Gobika", "Sibani", "Brethika", "Yaalini","Jemuna"};
        Trainee[] array = new Trainee[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Trainee("Name : "+strArray[i]);
        }
        for (Trainee trainee : array) {
            System.out.println(trainee);
        }

        Trainee trainee = array[2];
        System.out.println(trainee);


        String[] carArr = {"BMW", "Audi", "Tesla", "Toyoto", "Honda"};
        Car[] cars = new Car[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("Car Names : "+carArr[i]);
        }
        for (Car car : cars) {
            System.out.println(car);
        }

        DaysOfWeek joiningDay = t2.getJoiningDay();
        System.out.println(joiningDay);
    }


}
