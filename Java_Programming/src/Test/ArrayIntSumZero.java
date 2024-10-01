package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayIntSumZero {
    /**
     * Array - N unique integers that sum up to 0
     * Write a function that given an integer N (1<N<100),
     * Returns an array containing N unique integers that sum up to 0.
     * The function can return any such array.
     * For example, given N = 4, the function could return [1,0,-3,2] or [-2,1,-4,5].
     * The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
     * For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static void main(String[] args) {
        System.out.println(5/2 * 2);

        //System.out.println(Arrays.toString(arraySumZero(7)));
//        int n =11;
//        Random random = new Random();
//
//        List<Integer> numList = new ArrayList<>();
//        while (numList.size() < (n/2 * 2)) {
//            int number = random.nextInt(1, n+1);
//            System.out.println("number = " + number);
//
//            if (numList.isEmpty() || !numList.contains(number)) {
//                numList.add(number);
//            }
//        }
//        System.out.println("numList = " + numList);

        //System.out.println("Arrays.toString(randomIntArray(1, 12, 11)) = " + Arrays.toString(randomIntArray(1, 12, 11)));

        arraySumToZero(8);

    }

    public static int [] randomIntArray (int origin, int boundary, int n){
        //Random class to get random numbers
        Random random = new Random();

        //list to add random numbers
        List<Integer> numList = new ArrayList<>();

        //iterate and add to list, each number is unique
        // n/2 * 2 to make n even number, list must contain even amount of numbers, if n is odd, the last number is 0
        while (numList.size() < (n/2 * 2)) {
            int number = random.nextInt(origin, boundary);
            System.out.println("number = " + number);

            if (numList.isEmpty() || !numList.contains(number)) {
                numList.add(number);
            }
        }

        //make array from arraylist items
        int [] numArray = new int[numList.size()];
        for (int i =0; i < numList.size(); i++) {
            numArray[i] = numList.get(i);
        }

        System.out.println("numArray = " + Arrays.toString(numArray));

        return numArray;

    }


    //Educated approach upon researching google
    public static int[] arraySumZero(int n){

        int[] numbers = new int[n];

        if(n==1){
            return numbers;
        }

        for (int i = 1, index = 0; i <= numbers.length/2; i++, index+=2) {
            numbers[index] = i;
            numbers[index +1] = i *(-1);
        }

        return numbers;
    }

    //My approach
    public static int[] arraySumToZero(int n){

        int[] numbers = new int[n];

        if(n==1){
            return new int [1];
        }

        //fill an array with random numbers
        int [] numArray = randomIntArray(1,n+1,n);
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));

        //iterate and sum everything
        int sum = 0;
        for (int i : numArray) {
            sum += i;
        }

        boolean isOdd = false;
        //
        if(n%2!=0){
            isOdd = true;
            n= n-1;
        }

        //n is made to be even number
        //count the amount of divisions to reach 2 (2 numbers should add up to a common factor of the sum)
        int count = 0;
        while(n > 2){
            n /= 2;
            count++;
        }

        //divide to get smallest factor of the sum that we can get by adding 2 numbers
        while(count > 0){
            sum /=2;
            count --;
        }

        int sumOfTwo = sum;

        int [] finalOne = new int [numArray.length];
        List<Integer> finalOnes = new ArrayList<>();
        boolean isPositive = true;

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length; j++) {
               if(numArray[i] + numArray[j] == sumOfTwo){

                   if (isPositive) {
                       finalOnes.add(numArray[i]);
                       finalOnes.add(numArray[j]);
                   }else{
                       finalOnes.add(numArray[i] *(-1));
                       finalOnes.add(numArray[j] *(-1));
                   }

                   isPositive = !isPositive;

                   numArray[i] = 0;
                   numArray[j] = 0;

               }
            }

        }



        System.out.println("sum = " + sum);
        //int [] numArray = new int [n/2 * 2];

        //create sub



        return numbers;
    }

}
