package java_interview.numbers;

public class ArmstrongNumber {
    /*
Armstrong

Create a method to check if a number is an Armstrong number
    parameter: int
    return: boolean

An Armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number

    -> these numbers are also called narcissistic numbers

Ex:
    input: 153
    output: true

    the digits are 1, 5, and 3
    the calculation would be:
    1^3 + 5^3 + 3^3
        -> why is the exponent 3? because there is 3 digits in the number

    1^3 = 1 * 1 * 1 = 1
    5^3 = 5 * 5 * 5 = 125
    3^3 = 3 * 3 * 3 = 27

    1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number

Test data:
    153 -> true
    371 -> true
    9474 -> true
    9475 -> false
    123 -> false
*/
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
        System.out.println(isArmStrong2(154));
    }

    public static boolean checkArmstrong(int number){

        //after converting the number to String
        // split number string into single digit strings contained in an array
        String [] digits = Integer.toString(number).split("");

        //total number of single digits are the length of the array that is containing the string type digits
        int totalDigits = digits.length;

        int total = 0;

        //iterate through the string digit array
        // convert the digit to int and raise it power of total number of digits
        //add the result to total
        for (String digit : digits) {
            total += (int) Math.pow(Integer.parseInt(digit), totalDigits);

        }

        //compare initial number to the total
        return (number == total);
    }

    public static boolean isArmstrong(int n){

        String strNum = "" + n;
        int nLen = strNum.length();
        int sum = 0;

        for(int i = 0; i < strNum.length(); i++){
            int eachDigit = Integer.parseInt(strNum.substring(i , i + 1)); // "" + strNum.charAt(i)
            sum += Math.pow(eachDigit, nLen);   // each digit ^ pow
        }

        return sum == n;
    }

    public static boolean isArmStrong2(int n) { //

        int temp = n;
        int digits = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = n; // assigns the n value again
        int sum = 0;

        while(temp > 0){
            int eachDigit = temp % 10; // read the last digit
            sum += Math.pow(eachDigit, digits);
            temp /= 10;
        }

        return sum == n;
    }


}

