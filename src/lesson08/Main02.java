package lesson08;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxBound = 20;
        int minBound = 2;
        for (int i = 0; i < 10; i++) {
            int number = minBound + random.nextInt(maxBound - minBound + 1);
            System.out.print(number + " ");
        }

    }
}
