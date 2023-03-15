package lesson1;

import lesson1.impl.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Барсик", "Серый", 4) {
            @Override
            public void speak() {

            }

            @Override
            public void hunt() {

            }
        };
        System.out.println(animal.getName());

        Animal animal1 = new Animal("Shelbi") {
            @Override
            public void speak() {

            }

            @Override
            public void hunt() {

            }
        };
        System.out.println(animal1.getColor());

        Cat cat1 = new Cat("Мурзик");
//        System.out.println(animal1.getType());
//        System.out.println(cat1.getType());
        Dog dog1 = new Dog("Rex");
        Duck duck1 = new Duck("Donalt");
        Eagle eagle1 = new Eagle("Eagle");
        Fish fish1 = new Fish("Fish");
        Whale whale1 = new Whale("Whale");

//        cat1.speak();
//        animal1.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        animals.add(duck1);
        animals.add(eagle1);
        animals.add(fish1);
        animals.add(whale1);


//        animals.forEach(a -> System.out.println(a));
//
//        for (Animal a: animals) {
//            if(a instanceof Duck) ((Duck) a).fly();
//        }
        animals.forEach(Animal::speak);
//        animals.forEach(a -> a.fly());
//        animals.forEach(a -> a.toGo());
//        animals.forEach(a -> a.swim());
    }
}