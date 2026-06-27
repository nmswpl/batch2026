package in.co.nmsworks.training.week2.day3;

public class Animal {

    private Integer legs;

    public void sound(){
        System.out.println("Makes sound");
    }


}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("DOG BARKS");
    }
}
