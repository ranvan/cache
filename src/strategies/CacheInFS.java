package strategies;

import interfaces.Strategy;
import cacheLevel.SecondLevel;

import java.io.*;

public class CacheInFS<Key extends Serializable, Value extends Serializable> implements Strategy<Key, Value> {

    private SecondLevel<Key, Value> secondLevel = new SecondLevel<>();

    private int size = 0;

    @Override
    public void cache(Key key, Value value) throws Exception {
        secondLevel.save(key, value);
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
