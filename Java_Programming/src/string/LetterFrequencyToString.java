package string;

import java.util.Arrays;

public class LetterFrequencyToString {
    public static void main(String[] args) {
        /*
        String str="A2B5C4"
        return "AABBBBBCCCC"
         */
        String str = "A2B5C4";

        //second approach with regex
        String [] letters=str.replaceAll("[0-9]+"," ").trim().split(" ");
        String [] numbers=str.replaceAll("[^0-9]+"," ").trim().split(" ");

        String result="";
        for (int i =0; i < letters.length; i++) {
            int frequency = Integer.parseInt(numbers[i].trim());
            result += letters[i].repeat(frequency);
        }

        System.out.println(result);


        System.out.println(multiplyLetter(str));

        //third approach with skipping index in for loop
        String str2 = "A2B5C4";
        String result2 = "";
        for (int i = 0; i < str2.length()-1; i+=2) {
            int frequency = Character.getNumericValue(str.charAt(i+1));
            String letter = String.valueOf(str2.charAt(i));
            result2 += letter.repeat(frequency);
        }
        System.out.println("result2 = " + result2);
    }

    //initial approach
    public static String [] createPairs(String str){

        //we assume that letters and the frequency number are a pair
        //there would be 3 pairs in a String length of 6, therefore the array created for containing the pairs , has half the length of original string
        String [] pairs = new String[str.length()/2];

        int index =0; //tracks the index of pairs array
        for (int i = 0; i < str.length(); i+=2) {
            //increment by 2 and add pairs to the array
            pairs[index] = str.substring(i,i+2);
            index++;
        }
        return pairs;
    }

    public static String multiplyLetter(String str){
        //get alphanumeric pairs by calling createPairs method
        String[] alphaNumericPair = createPairs(str);

        String result=""; //for containing the final result
        for(int i =0; i < alphaNumericPair.length; i++){

            //parseInt accepts String only, frequency is originally char
            //char is converted to String by String.valueOf method
            int frequency = Integer.parseInt(String.valueOf(alphaNumericPair[i].charAt(1)));

            result += alphaNumericPair[i].substring(0,1).repeat(frequency);
        }
        return result;
    }
}
