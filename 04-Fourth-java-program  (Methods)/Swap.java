package com.kunal;

public class Swap {
    static void main(String[] args) {

/*

       int a = 10;
        int b = 20;

        // swap the values code
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);  prints:   20 30

 */

        // swap
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b); // prints: 10 20  (does not swap)

        // changeName
        String name = "Kunal kushwaha";
        changeName(name); // calls changeName method that change the name to Rahul rana
        System.out.println(name); // prints name? which name will print kunal or Rahul? it does not swap and
                                       // prints Kunal kushwaha


    }

    static void swap(int num1 , int num2){
        int temp = num1;
        num1=num2;
        num2=temp; // this change will only be valid inside that function its scope
    }

    // changeName
    static void changeName(String name){
        name = "Rahul Rana"; // creating a new object not modify and String can never be modified bec its final class
    }
}
