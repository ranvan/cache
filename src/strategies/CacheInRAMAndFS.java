package strategies;

import interfaces.Strategy;
import cacheLevel.FirstLevel;
import cacheLevel.SecondLevel;

import java.io.Serializable;

public class CacheInRAMAndFS<Key extends Serializable, Value extends Serializable> implements Strategy<Key, Value> {

    private FirstLevel<Key, Value> firstLevel = new FirstLevel<>();
    private SecondLevel<Key, Value> secondLevel = new SecondLevel<>();

    private int size = 0;

    @Override
    public void cache(Key key, Value value) throws Exception {
        if (firstLevel.size() < getSize()) {
            firstLevel.save(key, value);
        } else {
            secondLevel.save(key, value);
        }
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
