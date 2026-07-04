package in.co.nmsworks.training.week3.exercise;

import java.io.LineNumberReader;

public class Guest {

    String name;
    int guestID;
    Language prefLang;

    public Guest() {
    }

    public Guest(int guestID, String name, Language prefLang) {
        this.name = name;
        this.guestID = guestID;
        this.prefLang = prefLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public Language getPrefLang() {
        return prefLang;
    }

    public void setPrefLang(Language prefLang) {
        this.prefLang = prefLang;
    }
}
