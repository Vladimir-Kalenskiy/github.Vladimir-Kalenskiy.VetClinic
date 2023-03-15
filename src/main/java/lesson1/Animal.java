package lesson1;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public abstract class Animal {
    private String name;
    private String color;
    private int pawsCount;
    private static int animalsCount = 0;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    public abstract void speak();

    public abstract void hunt();

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", this.name, this.color);
    }
}
