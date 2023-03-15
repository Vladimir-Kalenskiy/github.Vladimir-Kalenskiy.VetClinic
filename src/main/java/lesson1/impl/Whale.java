package lesson1.impl;

import lesson1.Animal;
import lesson1.Illable;
import lesson1.Swimable;

public class Whale extends Animal implements Swimable, Illable {
    public Whale (String name, String color) {
        super(name, color, 4);
    }

    public Whale (String name) {
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
    public int getSwimSpeed() { return 70; }
}
