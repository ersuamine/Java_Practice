package java_arraylist;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {9, 8, 4, 0, 1, 3, 2, 5, 6, 10, 7};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {

            int temp;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {

                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));

        //sorting using the method from web
        int[] numbers2 = {9, 8, 4, 0, 1, 3, 2, 5, 6, 10, 7};
        System.out.println(Arrays.toString(numbers2));
        bubbleSort(numbers2,numbers2.length);
        System.out.println(Arrays.toString(numbers2));

    }

    // An optimized version of Bubble Sort
    // From geeksfrogeeks.com
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }


    }


}





