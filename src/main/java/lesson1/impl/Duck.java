package lesson1.impl;

import lesson1.*;

public class Duck extends Animal implements Flyable, Illable, Swimable, Speakable {
    public Duck (String name, String color) {
        super(name, color, 2);
    }

    public Duck (String name) {
        super(name);
    }

    public Duck() {}

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 30;
    }

    @Override
    public void getill() { System.out.println(getType() + " заболел."); }

    @Override
    public int getSwimSpeed() { return 30; }
}
