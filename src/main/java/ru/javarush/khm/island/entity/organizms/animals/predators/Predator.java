package ru.javarush.khm.island.entity.organizms.animals.predators;

import ru.javarush.khm.island.entity.organizms.Limit;
import ru.javarush.khm.island.entity.organizms.animals.Animal;

public abstract class Predator extends Animal {


    public Predator(String name, String icon, Limit limit) {
        super(name, icon, limit);
    }


}
