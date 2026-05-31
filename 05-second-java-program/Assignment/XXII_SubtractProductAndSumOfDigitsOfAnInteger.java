package com.rahul;

import java.util.Scanner;

public class XXII_SubtractProductAndSumOfDigitsOfAnInteger {
    //    22. Subtract the Product and Sum of Digits of an Integer
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = in.nextInt();

        int sum =0;
        int mul =1;

        while (num > 0){
            int digit = num % 10; // take last digit
            sum = digit + sum;
            mul = digit * mul;
            num = num/10;
        }

        int result = mul - sum;
        System.out.println(result);

    }
}

/*
Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */
