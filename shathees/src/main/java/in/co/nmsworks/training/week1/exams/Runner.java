package in.co.nmsworks.training.week1.exams;

public class Runner {
    public static void main(String[] args) {
        Mobiles m1 =new Mobiles(201,"samsung","Galaxy S24",79000.0);
        Mobiles m2 = new Mobiles(202,"Apple","iPhone 15",34000.00);
        Mobiles m3 = new Mobiles(203,"OnePlus","OnePlus 12",45000.00);
        Mobiles m4 = new Mobiles(204,"Google","pixel 6",60000.0);
        Mobiles m5 = new Mobiles(205,"Xiaomi","Xiami 14",23400.00);
        m1.display();;
        m2.display();
        m3.display();
        m4.display();
        m5.display();

        Books obj1 = new Books(101, "Java Programming", "James Gosling", 450.00);
        obj1.display();
        Books obj2 = new Books(102, "Python Programming", "van Rossum", 345.00);
        obj2.display();
        Books obj3 = new Books(103, "Javascript", "brendan eich", 245.00);
        obj3.display();
        Books obj4 = new Books(104, "c coding", "dennis Ritchie", 456.00);
        obj4.display();
        Books obj5 = new Books(105, "React Coding", "Jorden Walke", 234.00);
        obj5.display();

    }
}
