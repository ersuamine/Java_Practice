package java_interview.array;

public class MaxProfit {

        /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling on another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */

    public static void main(String[] args) {

        int[] sample = {8, 6, 5, 3, 4, 9, 17}; //setting up sample array with data

        int max = sample[0];
        int min = sample[0];

        int minIndex =0;
        int maxIndex =0;

        for (int i = 0; i < sample.length; i++) {

            //update max to value of current number, if current number is bigger than max
            if (max < sample[i]) {
                max = sample[i];
                maxIndex = i;
            //update min to value of current number, if current number is smaller than min
            } else if (min > sample[i]) {
                min = sample[i];
                minIndex = i;
            }
        }

        int maxProfit = max -min;
        
        //index start from 0, so the day number is index +1
        System.out.println("Buying on day " + (minIndex+1) + " for $" + min + " and selling on day " + (maxIndex+1) + " when it is worth $" + max +" gives the maximum profit of $" + maxProfit);


    }

}



