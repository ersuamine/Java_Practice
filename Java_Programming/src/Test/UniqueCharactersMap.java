package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharactersMap {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if ((map2.containsKey(key))) {
                map2.replace(key, (map2.get(key)) + 1);
            } else {
                map2.put(key, 1);
            }
            //this statement is not working because we are removing right after adding the value,
            // when the value becomes 2, it is being removed, when there's 4 duplicates of a char, it will not appear in final map
            // if letter has 3 duplicates, 1 will appear in the final map
            if (map2.get(key) != 1) {
                map2.remove(key);
            }
        }

        //Iterator use to remove keys with value more than one
//        Iterator <Character> iterator = map2.keySet().iterator();
//        while (iterator.hasNext()){
//            if (map2.get(iterator.next()) > 1){
//                iterator.remove();
//            }
//        }

        //This is intelliJ suggestion
        map2.keySet().removeIf(character -> map2.get(character) > 1);

        System.out.println(map2);// final result
    }
}
