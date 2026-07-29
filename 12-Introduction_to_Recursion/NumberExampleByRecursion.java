package kunal.com;

public class NumberExampleByRecursion {
    static void main(String[] args) {

        // write a function that takes in a number and prints it
        // print 1st 5 numbers 1 2 3 4 5

        print(1);
    }

    // What is Recursion : A function that calls itself
    // Base Call in Recursion: Its a condition where our recursion will stops making new calls as in line 23

    // if you are calling a function again and again u can treat it as call in the stack. take separate memory
    // in stack (every function call will take memory in stack / take the memory separately in stack)

    // note: when a function calls itself simultaneously and continuously then a point will come where
    // computer memory exceeds its limit that point call "Stack Overflow".

    // important point: A function will wait till the next function to resolve (wait in stack)

    static void print(int n){

        // Base Condition
        if( n == 5){
            System.out.println(n);
            return;
        }

//        recursive call
        System.out.println(n);

        // this is called tail recursion
        // this is the last function to be called
        print(n + 1);
    }
}
