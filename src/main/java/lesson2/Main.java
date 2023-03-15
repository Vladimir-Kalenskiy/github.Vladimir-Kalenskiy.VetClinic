package lesson2;


import lesson1.Animal;
import lesson1.Flyable;
import lesson1.Illable;
import lesson1.Runnable;
import lesson1.Speakable;
import lesson1.impl.*;
import veterinary.VetClinic;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Doctor("Иван"))
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Eagle("Клык"))
                .addAnimal(new Fish("Хвостик"))
                .addAnimal(new Whale("Боб"));

//        for (Animal a :
//                vetClinic.getAnimals()) {
//            a.getIll();
//        }
//        List<Illable> illables = new ArrayList<>();
//        illables.add(new Cat("Барсик"));
//        illables.add(new Human());

//        List<Flyable> flyables = new ArrayList<>();
//        flyables.add(new Eagle());
//        flyables.add(new Duck());
//
//        for (Flyable f:
//             flyables) {
//            System.out.println(f.getFlightSpeed());
//        }
//
//        System.out.println(Animal.getAnimalsCount());

        System.out.println("Все животные: ");
        for (Animal a:
             vetClinic.getAllAnimals()) {
            System.out.println(a);
        }

        System.out.println("\nВсе говорящие: ");
        for (Speakable a:
             vetClinic.getAllSpeakables()) {
            a.speak();
        }

        System.out.println("\nВсе бегающие: ");
        for (Runnable r:
             vetClinic.getAllRunnables()) {
            System.out.println(r);
        }

        System.out.println("\nВсе летающие: ");
        for (Flyable f:
             vetClinic.getAllFlyables()) {
            System.out.println(f);
        }

        System.out.println("\nВсе плавающие: ");
        for (Flyable f:
             vetClinic.getAllFlyables()) {
            System.out.println(f);
        }
    }
}
