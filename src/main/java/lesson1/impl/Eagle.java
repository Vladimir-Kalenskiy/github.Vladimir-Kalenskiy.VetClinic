package lesson1.impl;

import lesson1.Animal;
import lesson1.Flyable;
import lesson1.Illable;

public class Eagle extends Animal implements Flyable, Illable {
    public Eagle (String name, String color) {
        super(name, color, 4);
    }

    public Eagle (String name) {
        super(name);
    }

    public Eagle() {}


    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getill() { System.out.println(getType() + " заболел."); }
}
