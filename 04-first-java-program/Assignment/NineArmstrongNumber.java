package com.kunal;

import java.util.Scanner;

public class NineArmstrongNumber {
    static void main(String[] args) {
//        9. To find Armstrong Number between two given number.
//        sum of cubes of digits = original number
//        Example: 153
//  Calculation:
//           1³ + 5³ + 3³
//          = 1 + 125 + 27
//          = 153
//      So 153 is an Armstrong number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt(); // 153

        int sum = 0;
        int original = num; // original = 153

        while (num > 0) { //153 > 0 // 15 > 0 // 1 > 0 // 0 > 0 (false so jump outside the while loop)
            int digit = num % 10; // 153 % 10 = 3 --> digit = 3 // 15%10 = 5 --> digit = 5 // 1%10 = 1 --> digit = 1
            sum = sum+ (digit * digit * digit); // 0+(3*3*3) --> sum = 27 // 27+(5*5*5) = 152 --> sum = 152 // 152+(1*1*1) = 153 --> sum = 153
            num = num / 10; // 153/10 = 15 --> num = 15 // 15/10 = 1 --> num = 1 // 1/10 = 0 --> num = 0
        }

        if (sum == original){ // 153 == 153
            System.out.println(original + " is a Armstrong number!"); // print this !
        }
        else {
            System.out.println(original + " is not a Armstrong number!");
        }

    }
}

