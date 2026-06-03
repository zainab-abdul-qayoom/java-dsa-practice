package com.kunal;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {

        // any function inside a class called method
/*
        sum();
        sum2();
        int ans = sum2(); // i can store sum2 return value in variable called ans which is integer type as well
        System.out.println(ans);


 */

        // sum3
        int ans3 = sum3(30, 76);
        System.out.println(ans3);
    }

    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum; // return mean method over


    }

    // pass the value of numbers when you are calling the method in main()
//               sol: we can do that by arguments

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }


    static void sum() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
}
    /*

     static return_type name(arguments){
           // body
           return statement;
    }
     */
}
