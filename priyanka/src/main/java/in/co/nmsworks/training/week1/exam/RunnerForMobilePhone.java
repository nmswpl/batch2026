package in.co.nmsworks.training.week1.exam;

public class RunnerForMobilePhone {

    public static void main(String[] args) {

        MobilePhone obj1 = new MobilePhone(201,"Samsung","Galaxy S24",79999.0);
        obj1.mobliePhoneDetails();
        System.out.println();

        MobilePhone obj2 = new MobilePhone(202,"Samsung","Galaxy S28",85999.0);
        obj2.mobliePhoneDetails();
        System.out.println();

        MobilePhone obj3 = new MobilePhone(203,"OPPO","OPPO A16E",55999.0);
        obj3.mobliePhoneDetails();
        System.out.println();

        MobilePhone obj4 = new MobilePhone(204,"Vivo","Vivo 19",69999.0);
        obj4.mobliePhoneDetails();
        System.out.println();

        MobilePhone obj5 = new MobilePhone(205,"Realmi","Realmi 45",76999.0);
        obj5.mobliePhoneDetails();
        System.out.println();

    }
}
