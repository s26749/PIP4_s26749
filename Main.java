package studia;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {


        int[] genArr = generateArr(5);
        printArray(genArr);

        int[] sortedArr = sortingMethod(genArr);
        printArray(sortedArr);

        int[] revArr = revArray(sortedArr);

        equalsReverse(revArr, sortedArr);

    }

    public static int[] generateArr(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 101);
        }
        return array;
    }


    public static int[] sortingMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;

    }

    public static int[] revArray(int[] arr) {
        System.out.print("[");
        for (int i = (arr.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
        return arr;
    }

    public static void equalsReverse(int[] arr1, int[] arr2) {
        if (arr2.equals(arr1)) {
            System.out.println("true");
        } else System.out.println("false");
    }


    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
