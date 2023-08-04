package ru.javarush.khm.island.entity.organizms.animals.herbivores;

import ru.javarush.khm.island.abstraction.annotations.TypeData;
import ru.javarush.khm.island.entity.organizms.Limit;

@TypeData(name = "Лошадка", icon = "\uD83D\uDC0E", maxWeight = 400, maxCountInCell = 20,
        flockSize = 10, maxSpeed = 4, maxFood = 60)
public class Horse extends Herbivore {
    public Horse(String name, String icon, Limit limit) {
        super(name, icon, limit);
    }

}
