package in.co.nmsworks.training.week1.exam.set2;

public class MobilePhoneRunner {

    public static void main(String[] args) {

        MobilePhone phone1 = new MobilePhone();

        phone1.setPhoneId(201);
        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S24");
        phone1.setPrice(79999.0);

        System.out.println("ID = " + phone1.getPhoneId());
        System.out.println("Brand = " + phone1.getBrand());
        System.out.println("Model = " + phone1.getModel());
        System.out.println("Price = " + phone1.getPrice());
    }
}