package in.co.nmsworks.training.week1.exam;

public class MobilePhoneDetails {
    public int mobileId;
    public String mobileBrand;
    public String mobileModel;
    public double mobilePrice;

    public MobilePhoneDetails(int mobileId, String mobileBrand, String mobileModel, double mobilePrice) {
        this.mobileId = mobileId;
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobilePrice = mobilePrice;
    }

    public void display(){
        System.out.println("Id = " + this.mobileId);
        System.out.println("Brand = " + this.mobileBrand);
        System.out.println("Model = " + this.mobileModel);
        System.out.println("Price = " + this.mobilePrice);
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public double getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }
}
