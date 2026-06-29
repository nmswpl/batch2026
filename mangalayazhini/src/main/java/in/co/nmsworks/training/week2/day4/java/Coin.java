package in.co.nmsworks.training.week2.day4.java;

public class Coin {
    private Integer denomination; // 100

    public Integer getDenomination() {
        return denomination;
    }

    public void setDenomination(Integer denomination) {
        this.denomination = denomination;
    }

    public void spent(Integer amt){

        if(denomination >= amt){
            // Integer previousDenomination = denomination;
            denomination = denomination - amt ;
            System.out.println("The amount spent = "+amt);
            System.out.println("Remaining Balance in Digital Wallet : " + denomination);
        }
        else{
            System.out.println("Insufficient Balance !");
            System.out.println("Current Balance : " + denomination);
            System.out.println("Amount required by you : "+amt);
        }

    }
}
