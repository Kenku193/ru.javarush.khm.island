package ru.javarush.khm.island.services;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.javarush.khm.island.config.Setting;
import ru.javarush.khm.island.entity.Game;
import ru.javarush.khm.island.view.View;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class GameWorker extends Thread {
    public static final int CORE_POOL_SIZE = 4;
    private final Game game;
    private final int PERIOD = Setting.get().getPeriod();

    @Override
    public void run() {
        View view = game.getView();
        view.showMap();
        view.showStatistics();

        ScheduledExecutorService mainPool = Executors.newScheduledThreadPool(CORE_POOL_SIZE);

        List<OrganismWorker> workers = game
                .getEntityFactory()
                .getAllPrototypes()
                .stream()
                .map(o -> new OrganismWorker(o, game.getGameMap()))
                .toList();
        mainPool.scheduleWithFixedDelay(() -> runWorkers(view, workers)
                , PERIOD, PERIOD, TimeUnit.MILLISECONDS);

    }

    private void runWorkers(View view, List<OrganismWorker> workers) {
        ExecutorService servicePool = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        workers.forEach(servicePool::submit);
        servicePool.shutdown();
        awaitPool(view, servicePool);
    }

    @SneakyThrows
    private void awaitPool(View view, ExecutorService servicePool) {
        if (servicePool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS)) {
            view.showScale();
            view.showMap();
            view.showStatistics();
        }

    }
}
