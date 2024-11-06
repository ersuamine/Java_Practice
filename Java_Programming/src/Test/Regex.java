package Test;

public class Regex {

    public static void main(String[] args) {
        String str = "123ABS42";

        System.out.println(addNumbersInString(str));
    }
    public static int addNumbersInString(String num){
        //use regex to find all numbers in the string
        String [] numbers=num.replaceAll("[^0-9]+"," ").trim().split(" ");

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=Integer.parseInt(numbers[i].trim());

        }
        return sum;
    }
}
