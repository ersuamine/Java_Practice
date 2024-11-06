package string;

import java.util.ArrayList;
import java.util.List;

public class NumberSumOfString {

    public static void main(String[] args) {
        String str = "AB150CDE230";

        System.out.println(sumInString(str));

    }

    public static Integer sumInString(String str) {

        String[] array = str.split("");

        List<String> numString = new ArrayList<>();

        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);

                if (i == str.length() - 1) {
                    numString.add(num);
                    break;

                } else if (!((Character.isDigit(str.charAt(i))) && (Character.isDigit(str.charAt(i + 1))))) {

                    numString.add(num);
                    num = "";
                }

            }
        }

        System.out.println("numString = " + numString);

        return sumDigitsStringList(numString);
    }

    public static Integer sumDigitsStringList(List<String> list){
        Integer sum = 0;
        for (String each : list) {
            sum += Integer.parseInt(each);
        }
        return sum;
    }
}
