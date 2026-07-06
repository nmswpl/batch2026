package in.co.nmsworks.training.week3.day5;

public class HotelManagementRunner {

    public static void main(String[] args) {

        HotelManagement hotel = new HotelManagement();

        // New Guests
        Guest g1 = hotel.registerGuest("Arun", new GreetEnglish());

        Guest g2 = hotel.registerGuest("Kumar", new GreetTamil());

        Guest g3 = hotel.registerGuest("Rahul", new GreetHindi());

        System.out.println();

        // Existing Guests
        hotel.checkIn(g1.getId());

        hotel.checkIn(g2.getId());

        hotel.checkOut(g3.getId());

        hotel.checkOut(g2.getId());
    }
}