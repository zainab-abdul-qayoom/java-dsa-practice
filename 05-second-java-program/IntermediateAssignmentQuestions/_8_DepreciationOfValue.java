package com.rahul.rana;

import java.util.Scanner;

public class _8_DepreciationOfValue {
    static void main(String[] args) {
//       8.  Calculate Depreciation of Value
        Scanner sc = new Scanner(System.in);

        System.out.print("Original Value (initial price): ");
        double originalValue = sc.nextDouble();

        System.out.print("Rate (depreciation percentage per year): ");
        double rate = sc.nextDouble();

        System.out.print("Time (number in years): ");
        double time = sc.nextDouble();

        double depValue = (1 - rate/100);
        double result = originalValue * Math.pow(depValue, time);

        System.out.println("After " + time + " year the value is " + result);
    }
}
