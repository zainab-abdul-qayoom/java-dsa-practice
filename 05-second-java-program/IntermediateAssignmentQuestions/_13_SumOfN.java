package com.rahul.rana;

import java.util.Scanner;

public class _13_SumOfN {
    static void main(String[] args) {
        // 13. Sum Of N Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

       for (int i = 1; i<= n; i++){
           sum += i;
       }
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}
