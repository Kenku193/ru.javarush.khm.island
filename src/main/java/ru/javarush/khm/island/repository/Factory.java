package ru.javarush.khm.island.repository;

import ru.javarush.khm.island.entity.map.Cell;
import ru.javarush.khm.island.entity.organizms.Organism;

import java.util.List;

public interface Factory {

    Cell createRandomCell(boolean empty);

    List<Organism> getAllPrototypes();

}
