package ru.javarush.khm.island.entity.organizms.animals.predators;

import ru.javarush.khm.island.abstraction.annotations.TypeData;
import ru.javarush.khm.island.entity.organizms.Limit;

@TypeData(name = "Волк", icon = "\uD83D\uDC3A", maxWeight = 50, maxCountInCell = 30,
        flockSize = 15, maxSpeed = 3, maxFood = 8)
public class Wolf extends Predator {


    public Wolf(String name, String icon, Limit limit) {
        super(name, icon, limit);
    }

}
