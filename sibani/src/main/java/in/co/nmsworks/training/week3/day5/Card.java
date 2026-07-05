package in.co.nmsworks.training.week3.day5;



public class Card {
    private String shapePrefix;


    public Card() {
    }

    public Card(String shapePrefix) {
        this.shapePrefix = shapePrefix;

    }

    public String getShapePrefix() {
        return shapePrefix;
    }

    public void setShapePrefix(String shapePrefix) {
        this.shapePrefix = shapePrefix;
    }

    @Override
    public String toString() {
        return "Card{" +
                "shapePrefix='" + shapePrefix + '\'' +
                '}';
    }
}
