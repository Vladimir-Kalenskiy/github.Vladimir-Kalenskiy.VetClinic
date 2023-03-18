package lesson3.drugs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }
}
