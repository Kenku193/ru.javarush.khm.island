package ru.javarush.khm.island;


import ru.javarush.khm.island.config.Setting;
import ru.javarush.khm.island.entity.Game;
import ru.javarush.khm.island.entity.map.GameMap;
import ru.javarush.khm.island.repository.EntityFactory;
import ru.javarush.khm.island.repository.Factory;
import ru.javarush.khm.island.repository.GameMapCreator;
import ru.javarush.khm.island.services.GameWorker;
import ru.javarush.khm.island.view.ConsoleView;
import ru.javarush.khm.island.view.View;

public class ConsoleRunner {
    public static void main(String[] args) {
        Factory entityFactory = new EntityFactory();
        GameMapCreator gameMapCreator = new GameMapCreator(entityFactory);
        int rows = Setting.get().getRows();
        int cols = Setting.get().getCols();
        GameMap gameMap = gameMapCreator.createRandomFilledGameMap(rows, cols, false);
        View view=new ConsoleView(gameMap);
        Game game = new Game(gameMap, entityFactory,view);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();

    }
}
