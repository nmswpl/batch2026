package in.co.nmsworks.week2.day1.exam;

public class MobilePhoneRunner {
    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone();
        mp1.setId(201);
        mp1.setBrand("Samsung");
        mp1.setModel("Galaxy S24");
        mp1.setPrice(79999.0);


        MobilePhone mp2 = new MobilePhone();
        mp2.setId(202);
        mp2.setBrand(" Apple ");
        mp2.setModel("iPhone 16 ");
        mp2.setPrice(89999.0);


        MobilePhone mp3 = new MobilePhone();
        mp3.setId(203);
        mp3.setBrand("OnePlus");
        mp3.setModel("13R");
        mp3.setPrice(42999.0);

        MobilePhone mp4 = new MobilePhone();
        mp4.setId(204);
        mp4.setBrand("Google");
        mp4.setModel("Pixel 10 ");
        mp4.setPrice(74999.0);

        MobilePhone mp5 = new MobilePhone();
        mp5.setId(205);
        mp5.setBrand("Xiaomi");
        mp5.setModel("Redmi Note 15 ");
        mp5.setPrice(22999.0);

        System.out.println(mp1.getId());
        System.out.println(mp1.getBrand());
        System.out.println(mp1.getModel());
        System.out.println(mp1.getPrice());
        System.out.println(" ");


        System.out.println(mp2.getId());
        System.out.println(mp2.getBrand());
        System.out.println(mp2.getModel());
        System.out.println(mp2.getPrice());
        System.out.println(" ");

        System.out.println(mp3.getId());
        System.out.println(mp3.getBrand());
        System.out.println(mp3.getModel());
        System.out.println(mp3.getPrice());
        System.out.println(" ");

        System.out.println(mp4.getId());
        System.out.println(mp4.getBrand());
        System.out.println(mp4.getModel());
        System.out.println(mp4.getPrice());
        System.out.println(" ");

        System.out.println(mp5.getId());
        System.out.println(mp5.getBrand());
        System.out.println(mp5.getModel());
        System.out.println(mp5.getPrice());
        System.out.println(" ");

    }
}
