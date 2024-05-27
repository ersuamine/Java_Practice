package Challange;

import java.util.*;

public class AllSwap {
    public static void main(String[] args) {
        String [] strings = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String [] strings2 = { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(allSwap(strings)));

        System.out.println(Arrays.toString(strings2));
        System.out.println(Arrays.toString(allSwap(strings2)));

    }

    public static String[] allSwap(String[] strings) {
        //map to contain initial letter as key and the remaining letters as value
        Map <String,String> map = new HashMap<>();
        //map to store each string item and its index
        Map <String,Integer> mapIndex = new HashMap<>();

        for (int i =0; i < strings.length; i++) {
            String initial = strings[i].substring(0,1);
            String remaining = strings[i].substring(1);

            //add each string to map if the map does not have the string
            //continue to next iteration after adding because there's no value to compare
            if (!map.containsKey(initial)){
                map.put(initial,remaining);
                mapIndex.put(strings[i],i);
                continue;
            }

            if (!strings[i].isEmpty() && map.containsKey(initial))
            {
                //make temporary variables for swapping the strings in the array
                String temp = strings[i];
                String temp2= initial + map.get(initial);
                strings[i] = temp2;
                strings[mapIndex.get(temp2)] = temp;

                //after swapping remove swapped item from both maps
                //so they are not available for another swap
                map.remove(initial);
                mapIndex.remove(temp2);
            }
        }
        return strings;
    }

}
/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */