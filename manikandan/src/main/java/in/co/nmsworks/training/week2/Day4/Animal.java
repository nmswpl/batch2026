package in.co.nmsworks.training.week2.Day4;

import org.apache.commons.lang3.ClassUtils;

public interface Animal
{

    void makesSound();
    void eats();

}

interface Land extends Animal{

    void climb();
    void walks();

}

class Dog implements Animal,Land{
    @Override
    public void makesSound() {
        System.out.println("SOUND : BARKS");
    }

    @Override
    public void eats() {
        System.out.println("EATS : CURD");

    }

    @Override
    public void climb() {
        System.out.println("YES");
    }

    @Override
    public void walks() {
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesSound();
        d.climb();
    }
}
