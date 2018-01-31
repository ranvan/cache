import strategies.CacheInRAMAndFS;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        context.setStrategy(new CacheInRAMAndFS());
        context.setSize(5);
        context.executeStrategy("1", "2");
        context.executeStrategy("2", "1452345");
        context.executeStrategy("3", "gsbfgxbxvc");
        context.executeStrategy("4", "54wthsbgfb,");
        context.executeStrategy("5", "xbnxhg");
        context.executeStrategy("6", "56456,");
        context.executeStrategy("7", "znxhnh gf,");
        context.executeStrategy("8", "544htrgbm");
        context.executeStrategy("9", "xgfdj,");
    }
}
