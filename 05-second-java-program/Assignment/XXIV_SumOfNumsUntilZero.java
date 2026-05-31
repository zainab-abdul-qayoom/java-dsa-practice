package com.rahul;

import java.util.Scanner;

public class XXIV_SumOfNumsUntilZero {
    static void main(String[] args) {
//        24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sum = 0;

        while (num != 0){
            System.out.print("Enter num: ");
            num = sc.nextInt();
            sum = sum +  num;
        }

        System.out.println(sum);
    }
}
