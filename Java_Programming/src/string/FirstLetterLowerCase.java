package string;

public class FirstLetterLowerCase {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println("str = " + str);

        String str2 = "" + str.charAt(0);
        String str3 = String.valueOf(str.charAt(0));

        str2= str2.toLowerCase() + str.substring(1);

        System.out.println("str2 = " + str2);
    }
}
