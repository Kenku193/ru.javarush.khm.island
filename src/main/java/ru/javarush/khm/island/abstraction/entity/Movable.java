package ru.javarush.khm.island.abstraction.entity;

import ru.javarush.khm.island.entity.map.Cell;

@FunctionalInterface
public interface Movable {

    @SuppressWarnings("UnusedReturnValue")
    boolean move(Cell startCell);

}
