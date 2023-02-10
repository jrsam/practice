public class SingletonExample {

    private static SingletonExample SINGLETON_INSTANCE = new SingletonExample();

    public static SingletonExample getInstance() {
        return SINGLETON_INSTANCE;
    }
}
