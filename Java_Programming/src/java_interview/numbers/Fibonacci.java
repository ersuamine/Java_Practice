package java_interview.numbers;

public class Fibonacci {

    //instructor solution
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        //System.out.println(fib(8));
    }

    //instructor solution
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++){
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    //recursive method?
    public static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
