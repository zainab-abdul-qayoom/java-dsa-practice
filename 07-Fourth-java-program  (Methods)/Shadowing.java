package com.kunal;

public class Shadowing {

    static int x = 90; // this will be shadowed at line 13
    // if u create two same name variable that overlaps like one x is inside the class and other is inside the main
   // when the lower level variable hides the scope of upper level so higher level shadowed called shadowing

    static void main(String[] args) {

        System.out.println(x); // prints 90

        int x; // the class variable at line 5 is shadowed by this
      //  System.out.println(x); // Scope will begin when the value is initialized not when its declared so it
        // gives error if prints between declaring and initializing

        x = 40;
        System.out.println(x); // prints 40

        fun();
    }

    static void fun(){
        System.out.println(x); // prints 90
    }
}
