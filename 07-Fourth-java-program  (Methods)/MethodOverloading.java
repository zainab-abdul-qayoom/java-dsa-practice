package com.kunal;

public class MethodOverloading {
    static void main(String[] args) {

        // Method Overloading mean two or more method of same name with different arguments.
           // 1. either number of arguments should be different
          // 2. or the datatypes of arguments should be different

        // at compile time it decides which function to run

//        fun(12);
//        fun("Kunal Kushwaha");


        System.out.println( sum(23, 56));

        System.out.println(sum(43, 65, 865));
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
