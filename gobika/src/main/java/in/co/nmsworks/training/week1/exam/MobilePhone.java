package in.co.nmsworks.training.week1.exam;

public class MobilePhone {
    public static void main(String[] args) {
        Phone ph = new Phone(201, "Samsung", "Galaxy S24", 79999.00);
        System.out.println("Id = "+ph.getPhoneId());
        System.out.println("Brand = "+ph.getBrand());
        System.out.println("Model = "+ph.getModel());
        System.out.println("Price = "+ph.getPrice());
    }
}
