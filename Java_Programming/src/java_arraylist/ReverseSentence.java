package java_arraylist;

public class ReverseSentence {
    public static void main(String[] args) {
        String str= "I love coffee";
        String[] array = str.split(" ");
        String reversed = "";

        //concatenate each word into reversed variable by going from last index to first
        for (int i = array.length-1; i >=0; i--) {
            //concatenated and add the missing space
            reversed = reversed + array[i] + " ";
        }
        //trim the string to remove extra space that has been added during the last iteration of the loop
        System.out.println(reversed.trim());
    }
}
