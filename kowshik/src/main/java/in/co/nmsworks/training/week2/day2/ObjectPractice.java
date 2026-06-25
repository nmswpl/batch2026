package in.co.nmsworks.training.week2.day2;

public class ObjectPractice {
    public static void main(String[] args) {
        ObjectPractice op = new ObjectPractice();

        Customer c1 = new Customer(1, "Kowshik");
        Customer c2 = new Customer(2, "Senthil");

        System.out.println("Result : " + op.compareCustomers(c1, c2));

        op.displayFiveTrainees();

        Trainee[] trainees = new Trainee[5];

        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee("name - " + (i+1));
        }

        for (Trainee trainee : trainees) {
            System.out.println("Trainee Obj : " + trainee);
        }

        op.createAndDisplayCars();

    }

    private boolean compareCustomers(Customer c1, Customer c2){
        return c1.equals(c2);
    }

    private void displayFiveTrainees(){
        Trainee kowshik = new Trainee("Kowshik");
        Trainee vetri = new Trainee("Vetri");
        Trainee anas = new Trainee("Anas");
        Trainee siva = new Trainee("Siva");
        Trainee sathish = new Trainee("Sathish");

        System.out.println(kowshik);
        System.out.println(vetri);
        System.out.println(anas);
        System.out.println(siva);
        System.out.println(sathish);
    }

    private void createAndDisplayCars(){
        Car c1 = new Car(1, "i20", "Hyundai");
        Car c2 = new Car(2, "i10", "Hyundai");
        Car c3 = new Car(3, "Virtus", "Volkswagen");
        Car c4 = new Car(4, "Slavia", "Skoda");
        Car c5 = new Car(5, "Superb", "Skoda");

        Car[] cars = {c1, c2, c3, c4, c5};

        for (Car car : cars) {
            System.out.println(car);
        }
    }


}
