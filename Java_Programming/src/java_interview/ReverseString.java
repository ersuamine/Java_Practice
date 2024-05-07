package java_interview;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Coffee";

        System.out.println(reverseString(str));
    }


    public static String reverseString(String str){
        String reversed = "";
        //concatenate each letter from last index to first index

        //can also use stringbuilder
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

