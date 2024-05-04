package Challange;

import java.util.Arrays;

public class ArrayChallange {
    public static void main(String[] args) {

        String[] array = {"catbay","apple,bat,cat,goodbye,hello,yellow,why"};
        System.out.println(arrayChallenge(array));
    }

    private static String arrayChallenge(String[] strArray) {
        //split second element of the array to generate the dictionary
        String[] dictionary = strArray[1].split(",");

        //make strings to store the words of the first element
        String firstHalf = "";
        String secondHalf = "";

        //check if the words from dictionary are contained in the first element
        for (String word : dictionary) {
            //if word is found in first element, assign first and second word to variables and break out of the loop
            if (strArray[0].contains(word)) {
                secondHalf = strArray[0].replace(word, "");
                firstHalf = word;
                break;
                }
            }
        //check if the unchecked word is in the list
        for (String word : dictionary){
            //if the unchecked part of the word is in the array, return both words separated by comma
            if (word.equals(secondHalf)){
                return firstHalf + "," + secondHalf;
            }
        }

        return "String not possible";
    }
}
/*
Array Challenge

Have the function

ArrayChallange(strArr) read the array of strings stored in strArr, which will contain 2 elements: the first element will be a sequence of characters, and the second element will be a long string of comma-separated words, in alphabetical order, that represents a dictionary
of some arbitrary length.

For example:
strArr can be: ["hellocat", “apple,bat,cat,goodbye,hello,yellow,why”]

Your goal is to determine if the first element in the input can be split into two words, where both words exist in the dictionary that is provided in the second input. In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.

Your program should return the two words that exist in the dictionary separated by a comma. So for the example above, your program should return hello,cat. There will only be one correct way to split the first element of characters into two words. If there is no way to split string into two words that exist in the dictionary, return the string not possible. The first element itself will never exist in the dictionary as a real word.
 */