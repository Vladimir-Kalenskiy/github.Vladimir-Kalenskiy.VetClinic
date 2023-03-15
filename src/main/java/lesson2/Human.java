package lesson2;

import lesson1.*;
import lesson1.Runnable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class Human extends Animal implements Illable, Runnable, Swimable, Speakable {

    public Human(String name, String color, int pawsCount) {
        super(name, color, pawsCount=2);
    }

    public Human() {}

    public Human(String name) {
        super(name);
    }

    public abstract void work();

}
