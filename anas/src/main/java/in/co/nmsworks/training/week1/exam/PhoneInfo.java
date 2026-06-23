package in.co.nmsworks.training.week1.exam;

public class PhoneInfo {
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone(201, "Samsung", "Galaxy S24", 79999.0);
        MobilePhone p2 = new MobilePhone(202, "Apple", "iPhone 15", 69999.0);
        MobilePhone p3 = new MobilePhone(203, "OnePlus", "OnePlus 12", 59999.0);
        MobilePhone p4 = new MobilePhone(204, "Google", "Pixel 8", 64999.0);
        MobilePhone p5 = new MobilePhone(205, "Xiaomi", "Mi 14", 49999.0);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
    }

}

