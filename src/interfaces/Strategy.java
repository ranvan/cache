package interfaces;

public interface Strategy<Key, Value> {
    void cache(Key key, Value value) throws Exception;

    void setSize(int size);

    int getSize();
}
