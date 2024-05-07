package java_interview;

public class ReverseInteger {
    public static void main(String[] args) {
        //String conversion method

        //convert integer to string and then convert string to reverse

        /*
        Integer number = 1993;
        //String result = String.valueOf(number);
        System.out.println(number);

        String result = ""+number;

        System.out.println(ReverseString.reverseString(result));

         */

        // without making it a string, using modulus

        int num = 1988;
        int reversed = 0;

        while (num != 0){

            int digit = num % 10;
            System.out.println(digit);

            reversed = reversed *10 +digit;

            num = num/10;

        }
        System.out.println(reversed);


    }
}




