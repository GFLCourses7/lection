package singleton;

public class InnerStaticSingleton {
    private InnerStaticSingleton() {}

    private static class SingletonHelper {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
