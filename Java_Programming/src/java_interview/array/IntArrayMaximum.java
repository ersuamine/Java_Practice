package java_interview.array;

public class IntArrayMaximum {
    public static void main(String[] args) {

        /**
         * Array -- Find Maximum
         * Write a method that can find the maximum number from an int Array
         */

        int[] array = {10,11,14,26,29,30};

        int current = 0;

        for (int i=0; i<array.length; i++){
            if(current <array[i]){
                current = array[i];
            }
        }
        System.out.println("current = " + current);

    }
}
