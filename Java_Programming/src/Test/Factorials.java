package Test;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("Running");
        factorials(5);

    }

    public static void factorials(int num){
        if (num>0){
            System.out.println(num);
            factorials(num-1);
        }
    }
}
