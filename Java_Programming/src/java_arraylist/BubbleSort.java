package java_arraylist;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
/*
        int[] numbers = {9, 8, 4, 0, 1, 3, 2, 5, 6, 10, 7};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length ; i++) {
            //boolean swap = false;
            int temp = 0;
            for (int j = 0; j < numbers.length ; j++) {
                if (numbers[i] > numbers[j]) {
                    //swap = true;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));
    }*/
        int[] numbers = {4, 8, 9, 0, 1, 3, 2, 5, 6, 10, 7};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length-1; i++) {
            //boolean swap = false;
            int temp = 0;
            if (numbers[i] > numbers[i+1]) {
                //swap = true;
                temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
                System.out.println(Arrays.toString(numbers));

            }
//            for (int j = 0; j < numbers.length-1; j++) {
//
//
//            }

        }
        System.out.println(Arrays.toString(numbers));
    }

}

