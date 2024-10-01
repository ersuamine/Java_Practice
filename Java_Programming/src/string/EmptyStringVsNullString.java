package string;

public class EmptyStringVsNullString {
    public static void main(String[] args) {

        String str1 = ""; //empty string
        System.out.println("str1 = " + str1);
        System.out.println("str1.length() = " + str1.length());

        //not initialized string, cannot even print
        String str2;
        //cannot print, no value for printing
//        System.out.println("str2 = " + str2);
//        System.out.println("str2.length() = " + str2.length());

        //null string, printing result in NullPointerException
        String str3 = null;
        //cannot print
        System.out.println("str3 = " + str3);
        System.out.println("str2.length() = " + str3.length());
    }
}
