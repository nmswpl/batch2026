package in.co.nmsworks.training.week2.day2;

public class Car {
    private int id;
    private String make;
    private String model;
    //static int count=1;

    public Car() {
    }

    public Car(int id, String make, String model) {
        this.id = id;
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id= ' " + id + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] makes = {"Toyota", "Honda", "Ford", "Tesla", "BMW"};
        String[] models = {"Camry", "Civic", "Mustang", "Model 3", "3 Series"};

        Car[] newcar = new Car[5];

        for (int i = 0; i < newcar.length; i++) {
            newcar[i] = new Car( (i + 1) ,makes[i], models[i]);
        }

        for (Car c : newcar) {
            System.out.println(c);
        }
    }
}
