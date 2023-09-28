package creationalPattern.singletonPattern;

public class DBSingleton {

    private static class LAZY_HOLDER {
        static final DBSingleton INSTANCE = new DBSingleton();
    }

    private DBSingleton() {}

    public static DBSingleton getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }
}
