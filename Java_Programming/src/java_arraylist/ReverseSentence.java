package java_arraylist;

public class ReverseSentence {
    public static void main(String[] args) {
        String str= "I love coffee";
        String[] array = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        //concatenate each word into reversed variable by going from last index to first
        for (int i = array.length-1; i >=0; i--) {
            //concatenated and add the missing space
            reversed.append(array[i]).append(" ");
        }
        //trim the string to remove extra space that has been added during the last iteration of the loop
        System.out.println(reversed.toString().trim());
    }
}
