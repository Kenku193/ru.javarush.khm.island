package ru.javarush.khm.island.abstraction.entity;

import ru.javarush.khm.island.entity.map.Cell;

@FunctionalInterface
public interface Reproducible {

    @SuppressWarnings("UnusedReturnValue")
    boolean spawn(Cell currentCell);

}
