package in.co.nmsworks.training.week3.day5;

public class HotelRunner {

    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist();

        // New Guests
        Guest guest1 = receptionist.registerGuest("Priyanka", new English());
        Guest guest2 = receptionist.registerGuest("Arun", new Tamil());
        Guest guest3 = receptionist.registerGuest("Rahul", new Tamil());

        System.out.println();

        // Check In
        receptionist.checkIn(guest1);
        receptionist.checkIn(guest2);
        receptionist.checkIn(guest3);

        System.out.println();

        // Existing Guest
        Guest existingGuest = receptionist.getGuest(1002);

        receptionist.checkOut(existingGuest);
    }
}
