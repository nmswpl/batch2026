package in.co.nmsworks.training.week3practices;

public interface Language {

        String getLanguageName();
        void greetCheckIn(String guestName);
        void greetCheckOut(String guestName);
}
class EnglishLanguage implements Language {
    public String getLanguageName() { return "English"; }

    public void greetCheckIn(String guestName) {
        System.out.println("Hello " + guestName + "! Welcome to our hotel. Have a wonderful stay!");
    }

    public void greetCheckOut(String guestName) {
        System.out.println("Thank you " + guestName + "! Goodbye and have a safe journey!");
    }
}


class TamilLanguage implements Language {
    public String getLanguageName() { return "Tamil"; }

    public void greetCheckIn(String guestName) {
        System.out.println("வணக்கம் " + guestName + "! எங்களது விடுதிக்கு உங்களை அன்போடு வரவேற்கிறோம்!");
    }

    public void greetCheckOut(String guestName) {
        System.out.println("நன்றி " + guestName + "! மீண்டும் வருக, நல்வழிப் பயணம் அமையட்டும்!");
    }
}


class HindiLanguage implements Language {
    public String getLanguageName() { return "Hindi"; }

    public void greetCheckIn(String guestName) {
        System.out.println("नमस्ते " + guestName + "! हमारे होटल में आपका स्वागत है। आपकी यात्रा मंगलमय हो!");
    }

    public void greetCheckOut(String guestName) {
        System.out.println("धन्यवाद " + guestName + "! फिर मिलते हैं, आपकी यात्रा सुरक्षित हो!");
    }
}
