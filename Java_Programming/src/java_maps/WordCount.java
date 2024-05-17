package java_maps;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] strings = {"a","s","d","w","w","a","a"};
        System.out.println(wordCount(strings));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for(String each:strings){
            if (!map.containsKey(each)){
                map.put(each,1);
            }else{
                map.put(each,map.get(each)+1);
            }
        }

        return map;
    }
}
/*

The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */



