package lesson1.impl;

import lesson1.Animal;
import lesson1.Illable;
import lesson1.Swimable;

public class Fish extends Animal implements Swimable, Illable {
    public Fish(String name, String color) {
        super(name, color, 4);
    }

    public Fish (String name) {
        super(name);
    }

    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void getill() { System.out.println(getType() + " заболел."); }

    @Override
    public int getSwimSpeed() { return 50; }
}
