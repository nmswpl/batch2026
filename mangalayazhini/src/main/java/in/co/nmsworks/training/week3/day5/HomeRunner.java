package in.co.nmsworks.training.week3.day5;

public class HomeRunner {
    public static void main(String[] args) {
        AC voltasAC = new AC("Bosh",1500);
        TV sonyTV = new TV("Sony",150);
        SmartLight phlipsSmartLight = new SmartLight("Philips",20);

        Home myHome = new Home();

        myHome.myAppliances.add(voltasAC);
        myHome.myAppliances.add(sonyTV);
        myHome.myAppliances.add(phlipsSmartLight);

        myHome.myAppliances.get(0).switchOn();
        myHome.myAppliances.get(0).switchOff();

        myHome.myAppliances.get(0).switchOn();
        myHome.myAppliances.get(0).switchOff();

        myHome.myAppliances.get(1).switchOn();
        myHome.myAppliances.get(1).switchOff();

        myHome.myAppliances.get(1).switchOn();
        myHome.myAppliances.get(1).switchOff();

        myHome.myAppliances.get(1).switchOn();
        myHome.myAppliances.get(1).switchOff();

        myHome.myAppliances.get(2).switchOn();
        myHome.myAppliances.get(2).switchOff();



        myHome.calTotalEnergyCost();

    }
}
