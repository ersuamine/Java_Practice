package Challange;

import java.util.Arrays;

public class Sorting2DArray {
    public static void main(String[] args) {
        int[][] numbers = {{9, 6, 4, 2}, {6, 3, 4, 3, 54}, {0, 5, 3, 1, 11, 3}, {5, 4, 3, 6, 9, 8, 7, 2}};

        System.out.println(Arrays.deepToString(numbers));

        for (int k = 0; k < numbers.length; k++) {
            for (int i = 0; i < numbers[k].length; i++) {

                int temp;
                for (int j = 0; j < numbers[k].length; j++) {
                    if (numbers[k][i] < numbers[k][j]) {

                        temp = numbers[k][i];
                        numbers[k][i] = numbers[k][j];
                        numbers[k][j] = temp;
                    }
                }

            }
        }

        System.out.println(Arrays.deepToString(numbers));

    }
}

