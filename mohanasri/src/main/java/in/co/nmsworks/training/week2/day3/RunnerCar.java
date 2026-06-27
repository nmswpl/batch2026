package in.co.nmsworks.training.week2.day3;

public class RunnerCar {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(i, " ");
        }
        for (Car trainee : cars) {
            System.out.println(trainee);
        }


    }
}
