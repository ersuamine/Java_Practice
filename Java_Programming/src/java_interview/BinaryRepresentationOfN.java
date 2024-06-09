package java_interview;

import java.util.ArrayList;
import java.util.List;

/*
      Binary Representation Of N

      Create a method to determine how many 1s are in the representation of the number in binary form
          parameter: int
          return: int

          The given n will be more than 0

      Ex:
          input: 6
          output: 2

          6 in binary is 110
          there are two '1' digits, so the output is 2

      Test data:
          6 -> 110 -> 2
          7 -> 111 -> 3
          4 -> 100 -> 1
          10 -> 1010 -> 2
          15 -> 1111 -> 4
          16 -> 10000 -> 1
   */
public class BinaryRepresentationOfN {
    public static void main(String[] args) {

        System.out.println(binaryOne(15));
    }

    public static int binaryOne(int number) {
        int exponent = binaryPower(number);

        //if 2 raised to the exponent of given number is equal to given number,
        // the number of ones in binary number is 1
        if (Math.pow(2, exponent) == number) {
            return 1;
        }

        //make a list containing binary numbers, up to the current exponent of 2
        List<Integer> binaryTotal = new ArrayList<>();
        for (int i = exponent; i >= 0; i--) {
            binaryTotal.add((int) Math.pow(2, i));
        }

        //starting point, given number is bigger than current
        int current = (int) Math.pow(2, exponent);
        int oneCounter = 1; //current is less than given, so +1

        //add and check the remaining binary numbers to reach the given number
        for (int i = 1; i < binaryTotal.size(); i++) {
            current += i;

            //increment counter when current is less than the given number
            if (current <= number) {
                oneCounter++;

            //adding and checking, if bigger than given number, must subtract, taking the step back.
            } else {
                current -= i;
            }
        }
        return oneCounter;
    }

    //method for obtaining the exponent of 2 that is closes to the given number
    public static int binaryPower(int number) {
        boolean execute = true;
        int power = 0;
        while (execute) {
            //divide by 2, because binary is based on number 2, decimal numbers based on 10
            number = number / 2;

            if (number != 0) {
                power++;
            } else {
                execute = false;
            }
        }
        return power;
    }
}
