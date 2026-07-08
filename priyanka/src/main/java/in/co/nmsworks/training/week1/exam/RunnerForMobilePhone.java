package in.co.nmsworks.training.week1.exam;
import java.util.ArrayList;
import java.util.List;

public class RunnerForMobilePhone {
    public static void main(String[] args) {

        MobilePhone mobilePhone1 = new MobilePhone(201,"Samsung","Galaxy S24",79999.0);
        MobilePhone mobilePhone2 = new MobilePhone(202,"Samsung","Galaxy S28",85999.0);
        MobilePhone mobilePhone3 = new MobilePhone(203,"OPPO","OPPO A16E",55999.0);
        MobilePhone mobilePhone4 = new MobilePhone(204,"Vivo","Vivo 19",69999.0);
        MobilePhone mobilePhone5 = new MobilePhone(205,"Realmi","Realmi 45",76999.0);


        List<MobilePhone> objects = new ArrayList<>();
        objects.add(mobilePhone1);
        objects.add(mobilePhone2);
        objects.add(mobilePhone3);
        objects.add(mobilePhone4);
        objects.add(mobilePhone5);

        MobilePhone[] mobilePhones = new MobilePhone[5];
        int i = 0;

        for (MobilePhone object : objects) {
            mobilePhones[i++] = object;
        }
        for (MobilePhone mobilePhone : mobilePhones) {
            mobilePhone.mobilePhoneDetails();
            System.out.println();
        }
    }
}
