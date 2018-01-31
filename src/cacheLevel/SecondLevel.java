package cacheLevel;

import interfaces.Cacheble;

import java.io.*;

public class SecondLevel<Key extends Serializable, Value extends Serializable> implements Cacheble<Key, Value> {

    @Override
    public void save(Key key, Value value) throws Exception {
        String hash = String.valueOf(key.hashCode());
        String path = "C://test/secondLevel/" + hash + "/";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(value);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    @Override
    public Value extract(Key key) throws Exception {
        String hash = String.valueOf(key.hashCode());
        String path = "C://test/secondLevel/" + hash + "/";
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Value extractObject = (Value) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        return extractObject;
    }

    @Override
    public void delete(Key key) {
        String hash = String.valueOf(key.hashCode());
        String path = "C://test/secondLevel/" + hash + "/";
        File file = new File(path);
        file.delete();
    }

    @Override
    public void clear() {
        String path = "C://test/secondLevel/";
        File file = new File(path);
        file.delete();
    }

    @Override
    public int size() {
        return 0;
    }
}
