package java_interview.array;

/*
     Sort Array Descending

     Create a method that will sort the given array in descending order (largest to smallest).

     DO NOT USE any built in methods

     Ex:
         Input:
             [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
         Output:
             [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

  */

import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {
        int [] nums = new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        SortArrayDescending(nums);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

    }

    public static void SortArrayDescending(int[] array){

        int temp =0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if (array[i]>array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }
    }
}
