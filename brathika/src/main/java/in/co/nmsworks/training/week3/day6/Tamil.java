package in.co.nmsworks.training.week3.day6;

public class Tamil implements Language{
    @Override
    public String checkInMessage(String name) {
        return "வணக்கம், "+name+" ! உங்கள் தங்குதல் இனிதாக அமையட்டும்.";
    }

    @Override
    public String checkOutMessage(String name) {
        return "நன்றி, "+name+" மீண்டும் வருக.";
    }
}
