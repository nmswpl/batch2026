package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

public class Guest {
    private Integer guestId;
    private String guestName;
    private Language language;

    public Guest(Integer guestId, String guestName, Language language) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", guestName='" + guestName + '\'' +
                ", language=" + language +
                '}';
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
