package ru.javarush.khm.island.repository;

import ru.javarush.khm.island.entity.map.Cell;
import ru.javarush.khm.island.entity.map.GameMap;

public class GameMapCreator {
    private final Factory entityFactory;

    public GameMapCreator(Factory entityFactory) {
        this.entityFactory = entityFactory;
    }

    public GameMap createRandomFilledGameMap(int rows, int cols) {
        return createRandomFilledGameMap(rows, cols, false);
    }

    public GameMap createRandomFilledGameMap(int rows, int cols, boolean empty) {
        GameMap gameMap = new GameMap(rows, cols);
        Cell[][] cells = gameMap.getCells();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = entityFactory.createRandomCell(empty);
            }
        }
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col].updateNextCell(gameMap, row, col);
            }
        }
        return gameMap;
    }
}
