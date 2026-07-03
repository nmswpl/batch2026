package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Integer> seatNum;
    private String screenName;

    public Ticket() {
        this.seatNum = new ArrayList<>();
    }

    public List<Integer> getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(List<Integer> seatNum) {
        this.seatNum = seatNum;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }


}
