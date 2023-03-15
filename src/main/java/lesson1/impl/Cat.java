package lesson1.impl;

import lesson1.Animal;
import lesson1.Illable;
import lesson1.Runnable;
import lesson1.Speakable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cat extends Animal implements Illable, Runnable, Speakable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    public void hunt() {
        wakeUp();
        findFoot();
        eat();
    }

    private void wakeUp() {
        System.out.println("Сat проснулся.");
    }

    private void findFoot() {
        System.out.println("Cat ищет еду.");
    }

    private void eat() {
        System.out.println("Cat кушает.");
    }

    public void toPlay() {
        System.out.println("Cat играет.");
    }

    public void goToSleep() {
        System.out.println("Cat ложится спать.");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    public void fly() {
        System.out.println("Я кот, я не умею летать!!! Error!");
    }

    public void swim() {
        System.out.println("Я кот, я не умею плавать!!! Error!");
    }

    @Override
    public void getill() {
        System.out.println(getType() + " заболел.");
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }
}

