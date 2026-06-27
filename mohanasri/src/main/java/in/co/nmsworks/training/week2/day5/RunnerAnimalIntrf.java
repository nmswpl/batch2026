package in.co.nmsworks.training.week2.day5;

public class RunnerAnimalIntrf {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal a = new Dog();
//        dogMethod(dog);
        animalMethod(dog);
        animalMethod(cat);
        landbasedMethod(dog);
        landbasedMethod(cat);


//        catMethod(cat);
    }

    private static void landbasedMethod(LandBased lan) {
        System.out.println(lan.canClimb());
        System.out.println(lan.canWalk());
        lan.eats();
        lan.makeSound();


    }


    private static void animalMethod(Animal animal) {
        animal.makeSound();
        animal.eats();

    }


    private static void catMethod(Cat cat) {
        cat.eats();
        cat.makeSound();
    }

    private static void dogMethod(Dog dog) {
        dog.eats();
        dog.makeSound();
    }
}
