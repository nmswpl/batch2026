package in.co.nmsworks.training.week2.day2;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"anas");
        Customer c2 = new Customer(1, "bala");

        System.out.println(c1.equals(c2));
    }


}
