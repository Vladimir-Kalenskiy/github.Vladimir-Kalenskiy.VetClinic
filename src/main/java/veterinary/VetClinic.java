package veterinary;

import lesson1.*;
import lesson1.Runnable;
import lesson2.Doctor;
import lesson2.Human;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public List<Animal> getAnimals() {return animals;}

    public VetClinic addAnimal (Animal animal) {
        this.animals.add(animal);
        return this;
    }
    public VetClinic() {this.animals = new ArrayList<>();}

    public List<Animal> getAllAnimals() {
        return this.animals;
    }

    public List<Runnable> getAllRunnables () {
        List<Runnable> runnables = new ArrayList<>();

        for (Animal a:
             this.animals) {
            if (a instanceof Runnable) {
                runnables.add((Runnable) a);
            }
        }
        return runnables;
    }

    public List<Flyable> getAllFlyables () {
        List<Flyable> flyables = new ArrayList<>();

        for (Animal a:
             this.animals) {
            if(a instanceof Flyable) {
                flyables.add((Flyable) a);
            }
        }
        return flyables;
    }

    public List<Swimable> getAllSwimables() {
        List<Swimable> swimables = new ArrayList<>();

        for (Animal a:
             this.animals) {
            if(a instanceof Swimable) {
                swimables.add((Swimable) a);
            }
        }
        return  swimables;
    }

    public List<Speakable> getAllSpeakables() {
        List<Speakable> speakables = new ArrayList<>();

        for (Animal a:
             this.animals) {
            if(a instanceof Speakable) {
                speakables.add((Speakable) a);
            }
        }
        return speakables;
    }
}
