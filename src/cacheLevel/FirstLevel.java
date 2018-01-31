package cacheLevel;

import interfaces.Cacheble;

import java.util.HashMap;

public class FirstLevel<Key, Value> implements Cacheble<Key, Value> {

    private HashMap<Key, Value> hashMap = new HashMap<>();

    @Override
    public void save(Key key, Value value) {
        hashMap.put(key, value);
    }

    @Override
    public Value extract(Key key) throws Exception {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            throw new Exception();
        }
    }

    @Override
    public void delete(Key key) {
        hashMap.remove(key);
    }

    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public int size() {
        return hashMap.size();
    }
}
