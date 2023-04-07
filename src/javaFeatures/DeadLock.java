package javaFeatures;

public class DeadLock {

    static class Friend {
        String name;

        public Friend(String name) {
            this.name = name;
        }

        public void bow(Friend bowingTo) {
            System.out.println(this.name + " is bowing to " + bowingTo);
            bowingTo.bowBack(this);
        }

        public void bowBack(Friend friend) {
            System.out.println(this + " is bowing back to " + friend);
        }

        @Override
        public String toString() {
            return name;
        }
    }


    public static void main(String[] args) {
        Friend John = new Friend("John");
        Friend Doe = new Friend("Doe");

        new Thread(() -> John.bow(Doe)).start();

        new Thread(() -> Doe.bow(John)).start();


    }
}
