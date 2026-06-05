package com.rahul.rana;

import java.util.Scanner;

public class _24_SumOfDigitsOfNumber {
    static void main(String[] args) {
//        24. Sum Of A Digits Of Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = sc.nextInt();
        int sum = 0;
        int lastDigit;

        while (num > 0){
          lastDigit= num % 10;
          sum += lastDigit;
          num /= 10;

        }
        System.out.println(" Sum Of A Digits Of Number is " + sum);
    }
}
