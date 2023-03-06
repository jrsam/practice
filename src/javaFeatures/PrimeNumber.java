package javaFeatures;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        IntPredicate checkPrime = index -> index > 2 && number % index == 0;
        return IntStream.range(0, number).parallel().noneMatch(checkPrime);
    }


    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
    }
}
