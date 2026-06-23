package in.co.nmsworks.training.week1.exam;

public class RunnerPhone {

        public static void main(String[] args) {
            MobilePhone[] phones = new MobilePhone[5];

            phones[0] = new MobilePhone(201, "Samsung", "Galaxy S24", 79999.0);
            phones[1] = new MobilePhone(202, "Apple", "iPhone 15", 79900.0);
            phones[2] = new MobilePhone(203, "Google", "Pixel 8", 75999.0);
            phones[3] = new MobilePhone(204, "OnePlus", "OnePlus 12", 64999.0);
            phones[4] = new MobilePhone(205, "Xiaomi", "Xiaomi 14", 69999.0);

            for (MobilePhone phone : phones) {
                phone.displayDetails();
            }
        }
    }


