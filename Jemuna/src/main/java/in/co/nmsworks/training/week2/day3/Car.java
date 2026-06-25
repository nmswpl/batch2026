package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class Car {

    public static void main(String[] args) {

        String[] name={"Bolero","Xylo","Swift","Ford","Sumo"};
        String[] model={"Model1","Model2","Model3","Model4","Model5"};

        Car[] carObjArray = new Car[5];

        for (int i = 0; i < carObjArray.length; i++) {
            carObjArray[i] = new Car((i+1), name[i], model[i]);

        }

        System.out.println(" List of cars");

        for (Car car : carObjArray) {
            System.out.println(car);

        }

    }

    private int id;
    private String name;
    private String model;


    public Car(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}



