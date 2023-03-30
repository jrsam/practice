package javaFeatures;

import java.util.concurrent.*;
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
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(10,10,0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());

        String[] password = {"passowrd1", "passowrd2", "passowrd3", "passowrd4"};
        int[] input = IntStream.range(0, 100).toArray();
        for(int value: input) {
            Future result = executorService.submit(new PasswordHash(String.valueOf(value)));
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}
