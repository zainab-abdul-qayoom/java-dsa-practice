package com.rahul;

import java.util.Scanner;

public class XXVI_SumOfTwoNums {
    static void main(String[] args) {
//        26. Addition Of Two Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = sc.nextFloat();

        float sum = num1 + num2;
        System.out.println("The sum of: " + num1 + " and " + num2 + " is " + sum);
        
    }
}
