package in.co.nmsworks.training.week3.Day3;

public class FruitsPrice {
    private String names;
    private Double price;

    public FruitsPrice(String names, Double price) {
        this.names = names;
        this.price = price;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "fruitPrices{" +
                "names='" + names + '\'' +
                ", price=" + price +
                '}';
    }
}
