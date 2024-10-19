package lesson10;

import java.util.Random;

public class Main01 {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int generateRandomNumber(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }

    public static int[] generateRandomArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(min, max);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(0, 100, 10);
        print(arr);
        sort(arr);
        System.out.println();
        print(arr);
    }
}
