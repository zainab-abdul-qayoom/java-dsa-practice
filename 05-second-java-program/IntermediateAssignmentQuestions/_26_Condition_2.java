package com.rahul.rana;

import java.util.Scanner;

public class _26_Condition_2 {
    static void main(String[] args) {
//        26. Write a program to print the sum of negative numbers, sum of positive even numbers
//        and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//        The list terminates when the user enters a zero.

        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

         while (num != 0){
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num == 0){
                break;
            }
                if (num < 0) {
                    sumNegative += num;

                } else if (num % 2 == 0) {
                    sumPositiveEven += num;

                } else {
                    sumPositiveOdd += num;

                }

         }

        System.out.println("Sum of Negative numbers: " + sumNegative);
        System.out.println("Sum of Positive Even Numbers: " + sumPositiveEven);
        System.out.println("Sum of Positive Odd Numbers: " + sumPositiveOdd);
    }
}
