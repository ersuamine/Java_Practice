package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListRandomNum {
    public static void main(String[] args) {

        System.out.println("randomNumberList(5,2) = " + randomNumberList(5, 2));
        //make random number for list size and make a list with random numbers

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 4
//        int randomIndex = rand.nextInt(5);
//
//        int checkboxAmount = rand.nextInt(5);
//        System.out.println("randomIndex = " + randomIndex);
//        System.out.println("checkboxAmount = " + checkboxAmount);
//
//
//        List<Integer> indices = new ArrayList<>();
//
//        do {
//            int number = rand.nextInt(5);
//            if (indices.isEmpty() || !indices.contains(number)) {
//                indices.add(number);
//            }
//
//        } while (indices.size() <= checkboxAmount);
//
//        System.out.println("indices = " + indices);

    }

    /**
     *
     * @param maxNumber
     * @return random integer in the range from 0 to maxNumber
     * maxNumber is not inclusive
     */

    public static Integer randomNumber (int maxNumber){
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to maxNumber,
        // not including the maxNumber
        return rand.nextInt(maxNumber);
    }

    /**
     *
     * @param maxNumber
     * @param listSize
     * @return list of random numbers with the given size
     */
    public static List<Integer> randomNumberList (int maxNumber, int listSize){
        List<Integer> indices = new ArrayList<>();

        while (indices.size() < listSize){
            int number = randomNumber(maxNumber);
            if (indices.isEmpty() || !indices.contains(number)) {
                indices.add(number);
            }
        }
        System.out.println("indices = " + indices);

        return indices;
    }
}
