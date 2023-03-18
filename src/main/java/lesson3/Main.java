package lesson3;

import lesson3.drugs.Component;
import lesson3.drugs.impl.CatDrugs;
import lesson3.drugs.impl.components.Azitronit;
import lesson3.drugs.impl.components.Pinecilin;
import lesson3.drugs.impl.components.Water;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitronit("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrugs drug = new CatDrugs(componentsCat);

        for (Component c: drug) {System.out.println(c);}

        List<Component> componentsCat2 = List.of(new Azitronit("Азитрон", "4", 4),
                new Pinecilin("Пенецилин", "16", 6));
        List<Component> componentsCat3 = List.of(new Water("Вода", "20", 12),
                new Azitronit("Азитрон", "10", 9));
        List<Component> componentsCat4 = List.of(new Water("Вода", "20", 12),
                new Azitronit("Азитрон", "10", 100));

        CatDrugs drug1 = new CatDrugs(componentsCat);
        CatDrugs drug2 = new CatDrugs(componentsCat2);
        CatDrugs drug3 = new CatDrugs(componentsCat3);
        CatDrugs drug4 = new CatDrugs(componentsCat4);
        CatDrugs drug5 = drug4;

//        List<Drugs> drugs = new ArrayList<>();
//        drugs.add(drug1);
//        drugs.add(drug2);
//        drugs.add(drug3);
//        drugs.add(drug4);
//        //        System.out.println(drugs);
//
//        Collections.sort(drugs);
//        System.out.println(drugs);

        // задание 1 и 2, методы equals and hashCode переопределены в классе Drugs
        Set<CatDrugs> result = new HashSet<>();
        result.add(drug1);
        result.add(drug2);
        result.add(drug3);
        result.add(drug4);
        result.add(drug5);
        System.out.println(result);

    }

}
