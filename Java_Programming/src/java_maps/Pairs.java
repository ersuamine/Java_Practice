package java_maps;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        String [] str = {"code","bug","cat","meow"};//two words with "c"
        System.out.println(pairs(str));//output {b=g, c=t, m=w}
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        //iterate through each string and put substrings as key and value
        for (String each:strings){
            //get the first string and the very last string using substring,
            //and put inside the map
            map.put(each.substring(0,1),each.substring(each.length()-1));
        }
        return map;
    }

}
/*

Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */