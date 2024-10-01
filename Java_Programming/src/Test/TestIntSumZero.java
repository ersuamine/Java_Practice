package Test;

import java.util.ArrayList;
import java.util.List;

import static Test.ArrayIntSumZero.randomIntArray;

public class TestIntSumZero {
    public static void main(String[] args) {

        int n = 6;
        //fill an array with random numbers
        int[] numArray = randomIntArray(1, n + 1, n);

        //n is made to be even number
        int count = 0;
        while (n > 2) {
            n /= 2;
            count++;
        }
        //iterate and sum everything
        int sum = 0;
        for (int i : numArray) {
            sum += i;
        }
        //System.out.println("count = " + count);

        while (count > 0) {
            sum /= 2;
            count--;
        }

        //System.out.println("sum = " + sum);



        List<Integer> finalOnes = new ArrayList<>();
        boolean isPositive = true;

        int sumOfTwo = sum;
        System.out.println("sumOfTwo = " + sumOfTwo);
        
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == sumOfTwo) {

                    if (isPositive) {
                        finalOnes.add(numArray[i]);
                        finalOnes.add(numArray[j]);
                    } else {
                        finalOnes.add(numArray[i] * (-1));
                        finalOnes.add(numArray[j] * (-1));
                    }

                    isPositive = !isPositive;

                    numArray[i] = 0;
                    numArray[j] = 0;

                }
            }
        }

        System.out.println("finalOnes = " + finalOnes);
    }
}
