package in.co.nmsworks.training.week3.day6;

public interface Language {

    void checkIn(String name);
    void checkOut(String name);


    class English implements Language{

        @Override
        public void checkIn(String name) {
            System.out.println("Dear "+name+ "...Welcome to our hotel...Enjoy your stay...");
        }

        @Override
        public void checkOut(String name) {
            System.out.println("Thanks for staying dear "+name+" ...Please come again...Enjoy your day...");
        }
    }

    class Tamil implements Language{

        @Override
        public void checkIn(String name) {
            System.out.println("Vanakkam "+name+ "...Engal hotel ku vanthamaiku nadri...Meendum varuga...");
        }

        @Override
        public void checkOut(String name) {
            System.out.println("Nandri "+name+" ...meendum varuga...");
        }
    }


    class Hindi implements Language{

        @Override
        public void checkIn(String name) {
            System.out.println("Namasteyy "+name+ "hamare hotel mein aapka swagat hai...");
        }

        @Override
        public void checkOut(String name) {
            System.out.println("Dhanyvad "+name+" ,phir iyega...");
        }
    }


}
