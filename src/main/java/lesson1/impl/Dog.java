package lesson1.impl;

import lesson1.*;
import lesson1.Runnable;

public class Dog extends Animal implements Illable, Swimable, Runnable, Speakable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void getill() {
        System.out.println(getType() + " заболел.");
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }

    @Override
    public int getRunSpeed() {
        return 50;
    }
}
