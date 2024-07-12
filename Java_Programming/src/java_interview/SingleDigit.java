package java_interview;

public class SingleDigit {
    public static void main(String[] args) {
        System.out.println("lastDigit(-97) = " + lastDigit(-97));
        System.out.println("lastDigit(55) = " + lastDigit(55));

        System.out.println("firstDigit(1453) = " + firstDigit(1453));
        System.out.println("firstDigit(-93) = " + firstDigit(-93));
    }

    public static int firstDigit(int n) {

        while (Math.abs(n) > 10) { //iterate until 1 digit remains
            n = n / 10;
        }

        return n;
    }

    public static int lastDigit(int n) {
        n = Math.abs(n); //get absolute value of n, so the last digit is positive
        n = n % 10;

        return n;
    }


}
