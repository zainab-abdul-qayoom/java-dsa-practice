package kunal.com;

public class FibonacciOfNth {
    static void main(String[] args) {

        System.out.println(Fib(7)); // at number 7 the Fibonacci is 13
    }

    static int Fib(int n){

//        base condition
        if(n < 2){
            return n;
        }

        return Fib(n-1) + Fib(n-2);
    }
}
