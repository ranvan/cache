package interfaces;

public interface Cacheble<Key, Value> {
    void save(Key key, Value value) throws Exception;

    Value extract(Key key) throws Exception;

    void delete(Key key);

    void clear();

    int size();
}
