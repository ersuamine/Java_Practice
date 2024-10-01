package java_interview.array;

public class TriplesArray {

        /*
        Triples Array

        Create a method that will determine if the array has a triple or not. A triple is when an element is repeat 3 times in a row. If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */

    public static void main(String[] args) {

        int[] sample1 = {1, 1, 2, 2, 1};
        int[] sample2 = {1, 1, 2, 2, 2, 1};
        int[] sample3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println("noTriples(sample1) = " + noTriples(sample1));
        System.out.println("noTriples(sample2) = " + noTriples(sample2));
        System.out.println("noTriples(sample3) = " + noTriples(sample3));
        
    }

    public static boolean noTriples(int[] array) {
        boolean hasTriples = false;
        for (int i = 1; i < array.length - 1; i++) {

            if (array[i] == array[i - 1] && array[i] == array[i + 1]) {
                hasTriples = true;
                break;
            }
        }

        return !hasTriples;
    }
}
