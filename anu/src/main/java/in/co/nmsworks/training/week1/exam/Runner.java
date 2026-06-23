package in.co.nmsworks.training.week1.exam;

public class Runner {
    public static void main(String[] args){
        mobile mb=new mobile();
        mb.setId(201);
        System.out.println("ID : " + mb.getId());
        mb.setBrand("Samsung");
        System.out.println("Brand : " + mb.getBrand());
        mb.setModel("Galaxy S24");
        System.out.println("Modal :" + mb.getModel());
        mb.setPrice(79999.0);
        System.out.println("Price : " + mb.getPrice());
    }
}
