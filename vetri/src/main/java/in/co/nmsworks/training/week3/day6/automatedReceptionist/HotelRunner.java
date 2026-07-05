package in.co.nmsworks.training.week3.day6.automatedReceptionist;

public class HotelRunner {
    public static void main(String[] args) {
        AutomatedReceptionist receptionist = new AutomatedReceptionist();

        Language english = new English();
        Language tamil = new Tamil();

        System.out.println("=== Phase 1: New Guest Registration ===");
        String id1 = receptionist.registerGuest("Vetri", tamil);
        String id2 = receptionist.registerGuest("John", english);

        System.out.println("\n=== Phase 2: Processing Check-Ins ===");
        receptionist.processCheckIn(id1);
        receptionist.processCheckIn(id2);

        System.out.println("\n=== Phase 3: Processing Check-Outs ===");
        receptionist.processCheckOut(id1);
        receptionist.processCheckOut(id2);

        System.out.println("\n=== Phase 4: Testing Invalid Input Safety ===");
        receptionist.processCheckIn("G999");
    }
}
