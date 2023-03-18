package lesson3.drugs;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public abstract class Drugs implements Iterable<Component>, Comparable<Drugs> {
    private List<Component> components;
    int index;

    public int getDrugPower() {
        int power = 0;

        for (Component c :
                components) {
            power += c.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drugs drug = (Drugs) o;
        return index == drug.index && Objects.equals(components, drug.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
    }

    @Override
    public int compareTo(Drugs o) {
        int power = getDrugPower();
        return Integer.compare(power, o.getDrugPower());
//        if (power > o.getDrugPower()) return 1;
//        else if (power < o.getDrugPower()) return -1;
//        else return 0;
    }

    public Drugs(List<Component> components) {
        this.components = components;
        this.index = 0;
    }

    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
}
