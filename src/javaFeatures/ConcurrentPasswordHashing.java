package javaFeatures;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class PasswordHash implements Runnable {
    String password;

    public PasswordHash(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        System.out.println("print "+password);
    }
}

public class ConcurrentPasswordHashing {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(10,10,0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());

        String[] password = {"passowrd1", "passowrd2", "passowrd3", "passowrd4"};
        int[] input = IntStream.range(0, 5000).toArray();
        for(int value: input) {
            executorService.submit(new PasswordHash(String.valueOf(value)));
        }
    }
}
