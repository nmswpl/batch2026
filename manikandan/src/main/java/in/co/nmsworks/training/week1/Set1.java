package in.co.nmsworks.training.week1.exam;

public class Set1 {

    public static void main(String[] args) {
        medianofarray();
        Mobilephone.Display();
        printHundreds(278);
    }

    public static void medianofarray() {

        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        double median;

        if ( n % 2 != 0 ) {
            median = arr[n / 2];
        } else {

            int mid1 = arr[(n / 2) - 1];
            int mid2 = arr[n / 2];
            median = (double) (mid1 + mid2) / 2;
        }


        System.out.println("The median is: " + median);
    }

    public static class Mobilephone {


        int phoneid;
        String brand;
        String model;
        double price;

        public Mobilephone(int phoneid, String brand, String model, double price) {

            this.phoneid = phoneid;
            this.brand = brand;
            this.model = model;
            this.price = price;

        }

        public static void Display() {
            Mobilephone phones = new Mobilephone(1, "Samsung", "Galaxys24", 79999.0);
            System.out.println("Phone ID: " + phones.phoneid);
            System.out.println("Brand: " + phones.brand);
            System.out.println("Model: " + phones.model);
            System.out.println("Price: " + phones.price);
        }

    }

    public static void printHundreds(int num) {

        String[] words = {
                    "Zero", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine"
            };

            int absoluteNum = Math.abs(num);

            if (absoluteNum >= 100 && absoluteNum <= 999) {
                int hundredsDigit = absoluteNum/ 100;
                System.out.println("Output : " + words[hundredsDigit]);
            } else {
                System.out.println("Invalid input");
            }
        }



}


