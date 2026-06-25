package in.co.nmsworks.training.week1.set2;

public class Runner {
    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone(201, "Samsung", "Galaxy", 79999.9 );
        MobilePhone mp2 = new MobilePhone(202, "Oppo", "M!", 60000 );
        MobilePhone mp3 = new MobilePhone(203, "Samsung", "M@", 50000 );
        MobilePhone mp4 = new MobilePhone(204, "Iphone", "M3", 90000 );
        MobilePhone mp5 = new MobilePhone(205, "Poco", "M4", 70000 );

        mp1.display();
        mp2.display();
        mp3.display();
        mp4.display();
        mp5.display();


    }
}
