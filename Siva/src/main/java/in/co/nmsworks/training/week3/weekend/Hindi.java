package in.co.nmsworks.training.week3.weekend;

public class Hindi implements Language{

    @Override
    public void checkIn() {
        System.out.println("स्वागत है! आपका चेक-इन सफलतापूर्वक पूरा हो गया है। आपका प्रवास सुखद रहे।");
    }

    @Override
    public void checkOut() {
        System.out.println("हमारे साथ ठहरने के लिए धन्यवाद। आपकी यात्रा सुरक्षित और सुखद रहे!");
    }
}
