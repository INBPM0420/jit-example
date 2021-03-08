package ex3;

import java.util.stream.IntStream;

public class Main {

    static int testMethod() {
        return IntStream.range(0, 10)
            .map(n -> n + 1)
            .map(n -> n * n)
            .map(n -> n - 1)
            .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; ++i) {
            testMethod();
        }
        long end = System.nanoTime();
        System.out.printf("Time elapsed: %d\n", end - start);
    }

}