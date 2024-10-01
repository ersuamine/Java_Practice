package java_interview.numbers;

public class SumOfDigitsOfInteger {
    /*
Sum Of Digits Of Integer

Create a method that will calculate the sum of the number's digits. Do not use any String manipulation
    parameter: int
    return: int

Ex:
    input: 123
    output: 6
    -> 1 + 2 + 3

Test data:
    11111 -> 1 + 1 + 1 + 1 + 1 = 5
    54321 -> 5 + 4 + 3 + 2 + 1 = 15
    214 -> 2 + 1 + 4 = 7
*/
    public static void main(String[] args) {

        System.out.println("29 --> " + sumOfDigits(29));

        System.out.println("123 --> " + sumOfDigits(123));
    }

    public static int sumOfDigits(int n) {
        int sum = 0; // to contain sum of digits

        while (n != 0) { // loop over until n is 0, when n=0 loop stops
            sum += n % 10; // n % 10 gives the last digit
            n /= 10; //moves the decimal place to the left, updating n
            System.out.println("n = " + n);
        }
        return sum;
    }
}
