package java_interview;

public class FindingSecondMax {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 7, 3, 2, 4, 8, 12, 9};

        int firstMax = numbers[0];// giving initial values, usually index 0 number is set
        int secondMax = numbers[0];

        for (int number : numbers) {
            if (number > firstMax) {
                //secondMax = firstMax; // does not check when second max if after the first max
                firstMax = number;
            }

            if (number < firstMax && number > secondMax) {// if it's the middle value
                secondMax = number;
            }
        }
        System.out.println("secondMax = " + secondMax);
        System.out.println("firstMax = " + firstMax);
    }
}
