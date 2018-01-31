import interfaces.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String key, String value) throws Exception {
        strategy.cache(key, value);
    }

    public void setSize(int size) {
        strategy.setSize(size);
    }
}
