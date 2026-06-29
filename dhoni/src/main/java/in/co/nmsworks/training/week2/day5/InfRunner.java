package in.co.nmsworks.training.week2.day5;

public class InfRunner {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

//      dogMethod(dog);
//      catMethod(cat);

//      animalMethod(dog);
//      animalMethod(cat);

//        landBased(dog);
//        landBased(cat);

        Animal d = new Dog();
        d.eat();

    }

    private static void landBased(LandBased landBased) {
        landBased.makeSound();
        System.out.println("Can walk : "+ landBased.canWalk());
        System.out.println("Can climb : " + landBased.canClimb());
    }

    private static void animalMethod( Animal animal) {
        animal.makeSound();
        animal.eat();
    }

    private static void catMethod(Cat cat) {
        cat.eat();
        cat.makeSound();
    }

    private static void dogMethod(Dog dog) {
        dog.eat();
        dog.makeSound();
    }

}
