package ru.javarush.khm.island.abstraction.entity;

import ru.javarush.khm.island.entity.map.Cell;

@SuppressWarnings("unused")
@FunctionalInterface
public interface Eating {

    boolean eat(Cell currentCell);

}
