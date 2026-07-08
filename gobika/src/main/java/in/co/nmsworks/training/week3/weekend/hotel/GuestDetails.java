package in.co.nmsworks.training.week3.weekend.hotel;

public class GuestDetails {
    private String name;
    private String preferredLanguage;
    private String guestId;
    private Boolean isCheckin = false;

    public GuestDetails() {
    }

    public GuestDetails(String name, String preferredLanguage) {
        this.name = name;
        this.preferredLanguage = preferredLanguage;
    }

    public GuestDetails(String name, String preferredLanguage, String guestId, boolean isCheckin) {
        this.name = name;
        this.preferredLanguage = preferredLanguage;
        this.guestId = guestId;
        this.isCheckin = isCheckin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public Boolean getCheckin() {
        return isCheckin;
    }

    public void setCheckin(Boolean checkin) {
        isCheckin = checkin;
    }

    @Override
    public String toString() {
        return "GuestDetails{" +
                "name='" + name + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", guestId='" + guestId + '\'' +
                ", isCheckin=" + isCheckin +
                '}';
    }
}
