public class Main {
    public static void main(String[] args) {
        SingletonExample instance = SingletonExample.getInstance();
        SingletonExample anotherInstance = SingletonExample.getInstance();
        if(instance == anotherInstance) {
            System.out.println("Equal addresses");
        } else {
            System.out.println("Unequal addresses");
        }
    }
}
