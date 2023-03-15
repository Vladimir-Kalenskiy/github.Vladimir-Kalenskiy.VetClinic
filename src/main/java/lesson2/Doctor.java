package lesson2;

import lesson1.Speakable;

public class Doctor extends Human implements Speakable {

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Привет, меня зовут " + getName() );
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getRunSpeed() {
        return 20;
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
    @Override
    public void getill() { System.out.println(getType() + " заболел."); }

    @Override
    public void work() {
        System.out.println("Heal to animals");
    }
}
