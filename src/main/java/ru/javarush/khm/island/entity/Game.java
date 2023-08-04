package ru.javarush.khm.island.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.javarush.khm.island.entity.map.GameMap;
import ru.javarush.khm.island.repository.Factory;
import ru.javarush.khm.island.view.View;

@Getter
@RequiredArgsConstructor
public class Game {

    private final GameMap gameMap;
    private final Factory entityFactory;
    private final View view;

}
