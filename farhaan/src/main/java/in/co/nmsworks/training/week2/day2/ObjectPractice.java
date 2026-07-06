package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Mohamed");
        Customer c2 = new Customer(2, "Farhaan");
        if(c1.equals(c2)){
            System.out.println("The Customer Ids are same");
        }
        else{
            System.out.println("The Customer Ids are not Same");
        }

        Trainee t1 = new Trainee("Farhaan");
        Trainee t2 = new Trainee("Aakil");
        Trainee t3 = new Trainee("SaravanaPandi");
        Trainee t4 = new Trainee("Dhoni");
        Trainee t5 = new Trainee("Soundappan");
        System.out.println(t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5);

        Trainee[] trainees = new Trainee[5];
        String[] names = {"Farhaan", "Aakil", "Dhoni", "Mani", "Pandi"};

        for (int i = 0; i < 5; i++) {
            trainees[i] = new Trainee(names[i]);
        }
        for (int i = 0; i < trainees.length; i++) {
            System.out.println(trainees[i]);
        }
    }
}
