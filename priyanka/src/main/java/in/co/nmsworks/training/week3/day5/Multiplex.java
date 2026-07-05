package in.co.nmsworks.training.week3.day5;

public class Multiplex {

    public void bookTicket(int number, int[] screen) {

        if (checkAvailability(number, screen)) {

            int booked = 0;

            for (int i = 0; i < screen.length && booked < number; i++) {

                if (screen[i] == 0) {
                    screen[i] = 1;
                    booked++;
                    System.out.println("Seat " + (i + 1));
                }
            }

        } else {
            System.out.println(number + " seats unavailable");
        }
    }

    private boolean checkAvailability(int number, int[] screen) {

        int available = 0;

        for (int seat : screen) {
            if (seat == 0) {
                available++;
            }
        }

        return available >= number;
    }

    public void showAvailability(int[] screen) {

        int available = 0;

        for (int seat : screen) {
            if (seat == 0) {
                available++;
            }
        }

        System.out.println("Available seats : " + available);
    }
}