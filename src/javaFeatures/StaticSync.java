package javaFeatures;

class Table {

    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}

public class StaticSync {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                Table.printTable(1);
//                new javaFeatures.Table().printTable(1);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                Table.printTable(10);
//                new javaFeatures.Table().printTable(10);
            }
        };

        Thread t3 = new Thread(() -> Table.printTable(100));
//        Thread t3 = new Thread(() -> new javaFeatures.Table().printTable(100));
//
        Thread t4 = new Thread(() ->
                Table.printTable(1000)
        );
//        Thread t4 = new Thread(() ->
//                new javaFeatures.Table().printTable(1000)
//        );

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

