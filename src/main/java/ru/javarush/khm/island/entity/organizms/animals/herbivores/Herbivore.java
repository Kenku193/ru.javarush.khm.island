package ru.javarush.khm.island.entity.organizms.animals.herbivores;

import ru.javarush.khm.island.entity.organizms.Limit;
import ru.javarush.khm.island.entity.organizms.animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, String icon, Limit limit) {
        super(name, icon, limit);
    }
}
