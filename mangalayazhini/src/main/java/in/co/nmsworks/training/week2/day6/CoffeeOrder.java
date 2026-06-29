package in.co.nmsworks.training.week2.day6;

public class CoffeeOrder {
    private Double pricePerKg;
    private CoffeeBean coffeeBean;
    private Double purchaseCost ;


    public Double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(Double pricePerKg) {
        if(pricePerKg < 0.0){
            System.out.println("Invalid Price");
        }
        else{
            this.pricePerKg = pricePerKg;
        }
    }

    public CoffeeBean getCoffeeBean() {
        return coffeeBean;
    }

    public void setCoffeeBean(CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public Double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(Double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public CoffeeOrder(Double pricePerKg, CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
        if(pricePerKg < 0.0){
            System.out.println("Invalid Price");
        }
        else{
            this.pricePerKg = pricePerKg;
        }
    }

    public void processOrder(Integer coffeeGrams) {
        purchaseCost = coffeeGrams * pricePerKg ;
        System.out.println("Brewing the coffee");
    }

    public void printReceipt(){
        System.out.println("Cash Receipt : ");
        System.out.println("Price amount for coffee beans : " + purchaseCost);
    }

    public void printReceipt(String customerName){
        System.out.println("Cash Receipt for " + customerName + " : ");
        System.out.println("Price amount for coffee beans : " + purchaseCost);
    }


}
