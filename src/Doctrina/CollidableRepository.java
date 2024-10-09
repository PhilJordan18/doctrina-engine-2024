package Doctrina;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollidableRepository implements Iterable<StaticEntity>{
    private static CollidableRepository instance;
    private final List<StaticEntity> registeredEntities;

    private CollidableRepository() {
        registeredEntities = new ArrayList<>();
    }

    public static  CollidableRepository getInstance() {
        if (instance == null) {
            instance = new CollidableRepository();
        }
        return instance;
    }

    public void registerEntity(Collection<StaticEntity> entities) {
        registeredEntities.addAll(entities);
    }

    public void unregisterEntity(Collection<StaticEntity> entities) {
        registeredEntities.removeAll(entities);
    }

    public void unregisterEntity(StaticEntity entity) {
        registeredEntities.remove(entity);
    }

    public int count() {
        return registeredEntities.size();
    }

    @Override
    public Iterator<StaticEntity> iterator() {
        return registeredEntities.iterator();
    }
}

