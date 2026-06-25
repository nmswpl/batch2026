package in.co.nmsworks.training.week2.day3;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("swift", 1234, "i20");
        cars[1] = new Car("maruthi", 1554, "s20");
        cars[2] = new Car("mustang", 1098, "gt800");
        cars[3] = new Car("thar", 7654, "800");
        cars[4] = new Car("hyundai", 8903, "970");

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }
    }


}
