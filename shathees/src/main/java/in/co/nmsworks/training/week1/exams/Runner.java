package in.co.nmsworks.training.week1.exams;

public class Runner {
    public static void main(String[] args) {

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
