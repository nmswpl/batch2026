package in.co.nmsworks.training.week2.day5;

public class BankRunner {
    public static void main(String[] args) {

        Double principleAmount = 10000.0;

        StateBank sb = new StateBank();
        sb.setInterest(3.0);
        Double sbInterest = sb.calYearlyInterest(principleAmount);
        System.out.println("The simple interest of State Bank is : " + sbInterest);

        IndianBank ib = new IndianBank();
        ib.setInterest(1.0);
        Double ibInterest = ib.calYearlyInterest(principleAmount);
        System.out.println("The simple interest of Indian Bank is : " + ibInterest);

        FederalBank fb = new FederalBank();
        fb.setInterest(0.5);
        Double fbInterest = fb.calYearlyInterest(principleAmount);
        System.out.println("The simple interest of Federal Bank is : " + fbInterest);

    }
}
