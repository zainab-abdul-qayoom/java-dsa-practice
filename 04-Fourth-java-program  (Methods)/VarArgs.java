package com.kunal;

import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        // VarArgs mean Variable length argument when u don't know how many inputs user want to take
        fun(9, 87, 76, 34, 12, 8, 5, 23, 54);   // u can give any numbers it does not
                     // restrict give many u want to. it will store that numbers in arrays

        fun();

        multiple(23, 56, "Kunal", "Rahul");

        // Method Overlaoding Calling

        demo(23, 56, 76, 5);
        demo("Kunal", "Kushwaha", "Rahul", "Rana");
        // demo(); gives error if no parameters pass called Ambiguity bec both are demo and only be differentiated by parameters.
               // it will able to decide which one demo function should run so it gives error
    }

    static void multiple(int a, int b, String ...v){ // allow

    }


//    static void multiple(int a, String ...v, int b){ // not allow the unknown values array should be in last
//
//    }
//

    static void fun(int ...v){ // syntax of varargs ...name of array. Here the array of integers created
        System.out.println(Arrays.toString(v));
    }

    // Method Overloading

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
