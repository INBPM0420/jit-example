package ex2;

public class Main {

    public static boolean testMethod(int i) {
        return Integer.bitCount(i) % 2 == 0;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            testMethod(i);
        }
        long end = System.nanoTime();
        System.out.printf("Time elapsed: %d\n", end - start);
    }

}