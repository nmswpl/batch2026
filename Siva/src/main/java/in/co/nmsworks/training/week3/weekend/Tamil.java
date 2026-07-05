package in.co.nmsworks.training.week3.weekend;

public class Tamil implements Language{
    @Override
    public void checkIn() {
        System.out.println("வரவேற்கிறோம்! உங்கள் செக்-இன் உறுதிப்படுத்தப்பட்டது. இனிய தங்கும் அனுபவம் அமைய வாழ்த்துகள்.");
    }

    @Override
    public void checkOut() {
        System.out.println("எங்களுடன் தங்கியதற்கு நன்றி. உங்கள் பயணம் பாதுகாப்பாக அமைய வாழ்த்துகள்!");
    }
}
