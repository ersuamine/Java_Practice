package java_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        //iterate through each  2nd item
        for (int i = 0; i < words.size();) {
            //switch word with the adjacent word
            String word = words.get(i);
            words.set(i, words.get(i + 1));
            words.set(i + 1, word);
            //increment by 2, to skip adjacent element
            i+=2;

        }
        System.out.println(words);
    }
}
/*
Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
 */
