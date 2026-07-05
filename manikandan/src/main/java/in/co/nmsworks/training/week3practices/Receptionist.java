package in.co.nmsworks.training.week3practices;
import java.util.*;

public class Receptionist {

    private Map<String, Guest> guestDatabase = new HashMap<>();
    private Map<Integer, Language> supportedLanguages = new HashMap<>();
    private int nextGuestId = 1001;
    private Scanner scanner = new Scanner(System.in);

    public Receptionist() {

        supportedLanguages.put(1, new EnglishLanguage());
        supportedLanguages.put(2, new TamilLanguage());
        supportedLanguages.put(3, new HindiLanguage());
    }

    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();
        receptionist.startSimulation();
    }

    public void startSimulation() {
        while (true) {
            System.out.println("\n=== Welcome to Hotel Automated Reception ===");
            System.out.println("1. Guest Arrival");
            System.out.println("2. Exit System");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            if (option == 2) {
                System.out.println("Shutting down automated system. Goodbye!");
                break;
            }

            processGuestInteraction();
        }
    }

    private void processGuestInteraction() {
        System.out.print("Are you a new guest? (yes/no): ");
        String status = scanner.nextLine().trim().toLowerCase();

        Guest currentGuest = null;

        if (status.equals("yes")) {
            currentGuest = registerNewGuest();
        } else if (status.equals("no")) {
            System.out.print("Please enter your Guest ID: ");
            String id = scanner.nextLine().trim();
            currentGuest = guestDatabase.get(id);
            if (currentGuest == null) {
                System.out.println("Guest ID not found! Starting registration instead.");
                currentGuest = registerNewGuest();
            }
        } else {
            System.out.println("Invalid input. Aborting transaction.");
            return;
        }


        System.out.println("Select Action: 1. Check-In  2. Check-Out");
        int action = scanner.nextInt();
        scanner.nextLine();

        Language lang = currentGuest.getPreferredLanguage();
        if (action == 1) {
            lang.greetCheckIn(currentGuest.getName());
        } else if (action == 2) {
            lang.greetCheckOut(currentGuest.getName());
        } else {
            System.out.println("Invalid Action Selected.");
        }
    }

    private Guest registerNewGuest() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Select your preferred language:");
        for (Map.Entry<Integer, Language> entry : supportedLanguages.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getLanguageName());
        }
        System.out.print("Enter language choice number: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Language selectedLanguage = supportedLanguages.getOrDefault(choice, new EnglishLanguage());

        String generatedId = "G" + nextGuestId++;
        Guest newGuest = new Guest(generatedId, name, selectedLanguage);
        guestDatabase.put(generatedId, newGuest);

        System.out.println("Registration complete! Your Unique Guest ID is: " + generatedId);
        return newGuest;
    }
}