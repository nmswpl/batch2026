package in.co.nmsworks.training.week2.day4.java;

public class Runner {
    public static void main(String[] args) {
        SchoolBag wildCraft = new SchoolBag();
        wildCraft.setMaxWeight(100);
        wildCraft.setBrandName("Wildcraft");
        wildCraft.setTextBook(new TextBook("Java Programming"));

        wildCraft.open();
        wildCraft.study();

        DigitalWallet dw = new DigitalWallet(new Coin(5));
        dw.setColor("Blue");

        dw.carry();
        dw.getCoin().spend();

    }
}
