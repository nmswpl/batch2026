package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class Home {

    List<Appliance> myAppliances ;

    Home(){
        myAppliances = new ArrayList<>();
    }

    public Double calTotalEnergyCost(){
        Integer totalPower = 0  ;
        for (Appliance myAppliance : myAppliances) {
            totalPower += myAppliance.calculateTotalPowerUsed();
        }

        Double totalBillCost = (1.0/10.0) * totalPower ;
        System.out.println("Total cost : " + totalBillCost);
        return totalBillCost;
    }
}
