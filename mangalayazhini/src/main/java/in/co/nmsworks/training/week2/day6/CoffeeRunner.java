package in.co.nmsworks.training.week2.day6;

public class CoffeeRunner {
    public static void main(String[] args) {
        CoffeeBean bean = new CoffeeBean("Arabica", "Medium");
        CoffeeOrder cf = new CoffeeOrder(700.0,bean);
        cf.processOrder(2);
        cf.printReceipt();
        cf.printReceipt("John");



    }
}
