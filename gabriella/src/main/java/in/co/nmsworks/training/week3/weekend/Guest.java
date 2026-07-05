package in.co.nmsworks.training.week3.weekend;

import java.util.Objects;

public class Guest {

    private Integer guestId;
    private String guestName;
    private Language preferredLanguage;
    private boolean checkedIn;
    private static Integer noOfGuests = 0;

    public Guest(String guestName, Language preferredLanguage) {
        noOfGuests += 1;
        this.guestId = noOfGuests;
        this.guestName = guestName;
        this.preferredLanguage = preferredLanguage;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public static Integer getNoOfGuests() {
        return noOfGuests;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void checkIn(){
        checkedIn = true;
        switch (getPreferredLanguage()) {
            case ENGLISH:
                System.out.println("Welcome in English");
                break;
            case HINDI:
                System.out.println("Welcome in Hindi");
                break;
            case TAMIL:
                System.out.println("Welcome in Tamil");
                break;
            default:
                System.out.println("Language not supported");
        }

    }

    public void checkOut(){
        noOfGuests--;
        checkedIn = false;
        switch (getPreferredLanguage()) {
            case ENGLISH:
                System.out.println("Thank you and goodbye in English");
                break;
            case HINDI:
                System.out.println("Thank you and goodbye in Hindi");
                break;
            case TAMIL:
                System.out.println("Thank you and goodbye in Tamil");
                break;
            default:
                System.out.println("Language not supported");
        }

    }



    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(guestName, guest.guestName) && preferredLanguage == guest.preferredLanguage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestName, preferredLanguage);
    }
}
