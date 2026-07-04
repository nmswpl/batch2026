package in.co.nmsworks.training.week3.day5;


 class Multiplex {
    private Screen[] screens;

    public Multiplex(int numberOfScreens, int seatsPerScreen) {
        screens = new Screen[numberOfScreens];

        for (int i = 0; i < numberOfScreens; i++) {
            screens[i] = new Screen(i + 1, seatsPerScreen);
        }
    }

    public String bookTicket() {
        for (Screen screen : screens) {
            if (screen.hasAvailability()) {
                return screen.bookSeat();
            }
        }
        return null;
    }

    public void checkAvailability() {
        for (Screen screen : screens) {
            System.out.println(
                    "Screen " + screen.getScreenId() +
                            " Available Seats: " + screen.getAvailableSeats()
            );
        }
    }
}
